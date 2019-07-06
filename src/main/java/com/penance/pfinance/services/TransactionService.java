package com.penance.pfinance.services;

import com.penance.pfinance.api.DTO.TransactionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {

    List<TransactionDTO> getAllTransactions();

    TransactionDTO getTransactionById(Long id);

    TransactionDTO createNewTransaction(TransactionDTO transactionDTO);

    TransactionDTO saveTransactionByDTO(Long id, TransactionDTO transactionDTO);

    TransactionDTO patchTransaction(Long id, TransactionDTO transactionDTO);

    void deleteTransactionById(Long id);
}
