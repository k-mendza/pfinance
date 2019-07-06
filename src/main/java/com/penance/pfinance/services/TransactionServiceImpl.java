package com.penance.pfinance.services;

import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.api.v1.mappers.TransactionMapper;
import com.penance.pfinance.model.Transaction;
import com.penance.pfinance.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionMapper transactionMapper;
    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionMapper transactionMapper, TransactionRepository transactionRepository) {
        this.transactionMapper = transactionMapper;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<TransactionDTO> getAllTransactions() {
        return transactionRepository.findAll()
                .stream()
                .map(transactionMapper::transactionToTransactionDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TransactionDTO getTransactionById(Long id) {
        return transactionMapper.transactionToTransactionDTO(transactionRepository.findById(id).orElse(null));
    }

    @Override
    public TransactionDTO createNewTransaction(TransactionDTO transactionDTO) {

        Transaction transaction = transactionMapper.transactionDTOToTransaction(transactionDTO);

        return null;
    }

    @Override
    public TransactionDTO saveTransactionByDTO(Long id, TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public TransactionDTO patchTransaction(Long id, TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public void deleteTransactionById(Long id) {
        transactionRepository.deleteById(id);
    }
}
