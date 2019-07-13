package com.penance.pfinance.services;

import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.api.v1.mappers.CurrencyMapper;
import com.penance.pfinance.api.v1.mappers.TransactionMapper;
import com.penance.pfinance.controllers.v1.TransactionController;
import com.penance.pfinance.model.Transaction;
import com.penance.pfinance.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionMapper transactionMapper;
    private final CurrencyMapper currencyMapper;
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionMapper transactionMapper, CurrencyMapper currencyMapper, TransactionRepository transactionRepository) {
        this.transactionMapper = transactionMapper;
        this.currencyMapper = currencyMapper;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<TransactionDTO> getAllTransactions() {
        return transactionRepository.findAll()
                .stream()
                .map(transaction -> {
                    TransactionDTO transactionDTO = transactionMapper.transactionToTransactionDTO(transaction);
                    transactionDTO.setTransactionUrl(getTransactionUrl(transaction.getId()));
                    return transactionDTO;
                })
                .collect(Collectors.toList());
    }

    @Override
    public TransactionDTO getTransactionById(Long id) {
        return transactionRepository.findById(id)
                .map(transactionMapper::transactionToTransactionDTO)
                .map(transactionDTO -> {
                    transactionDTO.setTransactionUrl(getTransactionUrl(id));
                    return transactionDTO;
                }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public TransactionDTO createNewTransaction(TransactionDTO transactionDTO) {
        return saveAndReturnDTO(transactionMapper.transactionDTOToTransaction(transactionDTO));
    }

    @Override
    public TransactionDTO saveTransactionByDTO(Long id, TransactionDTO transactionDTO) {
        Transaction transaction = transactionMapper.transactionDTOToTransaction(transactionDTO);
        transaction.setId(id);
        return saveAndReturnDTO(transaction);
    }

    @Override
    public TransactionDTO patchTransaction(Long id, TransactionDTO transactionDTO) {
        return transactionRepository.findById(id).map(transaction -> {
            if (transactionDTO.getAmount() != null) {
                transaction.setAmount(transactionDTO.getAmount());
            }

            if (transactionDTO.getCurrencyDTO() != null) {
                transaction.setCurrency(currencyMapper.currencyDTOToCurrency(transactionDTO.getCurrencyDTO()));
            }

            TransactionDTO returnDTO = transactionMapper.transactionToTransactionDTO(transactionRepository.save(transaction));

            returnDTO.setTransactionUrl(getTransactionUrl(id));


            return returnDTO;
        }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public void deleteTransactionById(Long id) {
        transactionRepository.deleteById(id);
    }

    private TransactionDTO saveAndReturnDTO(Transaction transaction) {
        Transaction savedTransaction = transactionRepository.save(transaction);
        TransactionDTO returnDTO = transactionMapper.transactionToTransactionDTO(savedTransaction);

        returnDTO.setTransactionUrl(getTransactionUrl(savedTransaction.getId()));

        return returnDTO;
    }

    private String getTransactionUrl(Long id){
        return TransactionController.BASE_URL + "/" + id;
    }
}
