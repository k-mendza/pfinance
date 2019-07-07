package com.penance.pfinance.services;

import com.penance.pfinance.api.v1.DTO.AppUserDTO;
import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.api.v1.mappers.TransactionMapper;
import com.penance.pfinance.model.*;
import com.penance.pfinance.repositories.TransactionRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class TransactionServiceImplTest {

    TransactionService transactionService;

    @Mock
    TransactionRepository transactionRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        transactionService = new TransactionServiceImpl(TransactionMapper.INSTANCE, transactionRepository);
    }

    @Test
    public void getAllTransactions() throws Exception {

        //given
        List<Transaction> transactions = Arrays.asList(new Transaction(), new Transaction(), new Transaction());

        when(transactionRepository.findAll()).thenReturn(transactions);

        //when
        List<TransactionDTO> transactionDTOS = transactionService.getAllTransactions();

        //then
        assertEquals(3, transactionDTOS.size());
    }

    @Test
    public void createNewTransaction() throws Exception {

        //given
        TransactionDTO transactionDTO = new TransactionDTO();

        AppUserDTO appUserDTO = new AppUserDTO();

        appUserDTO.setEmail("devfinance@fin.com");
        appUserDTO.setId(1L);

        transactionDTO.setId(1L);
        transactionDTO.setAppUserDTO(appUserDTO);
        transactionDTO.setTitle("title");
        transactionDTO.setDescription("desc");
        transactionDTO.setCreationDate(LocalDate.of(2019,7,7));
        transactionDTO.setPaymentDate(LocalDate.of(2019,7,6));
        transactionDTO.setAmount((float) 99.99);

        Transaction savedTransaction = new Transaction();
        savedTransaction.setId(1L);
        savedTransaction.setAmount(transactionDTO.getAmount());

        //when
        when(transactionRepository.save(any(Transaction.class))).thenReturn(savedTransaction);
        TransactionDTO savedDTO = transactionService.createNewTransaction(transactionDTO);

        //then
        assertEquals(transactionDTO.getId(), savedDTO.getId());
        assertEquals(transactionDTO.getAmount(), savedDTO.getAmount());
        assertEquals("/api/v1/transactions/1", savedDTO.getTransactionUrl());
    }

    @Test
    public void saveTransactionByDTO() throws Exception {

        //given
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setAmount((float) 99.00);

        Transaction savedTransaction = new Transaction();
        savedTransaction.setAmount(transactionDTO.getAmount());
        savedTransaction.setId(1L);

        //when
        when(transactionRepository.save(any(Transaction.class))).thenReturn(savedTransaction);
        TransactionDTO savedDTO = transactionService.saveTransactionByDTO(1L, transactionDTO);

        //then
        assertEquals(transactionDTO.getAmount(), savedDTO.getAmount());
        assertEquals("/api/v1/transactions/1", savedDTO.getTransactionUrl());
    }
}