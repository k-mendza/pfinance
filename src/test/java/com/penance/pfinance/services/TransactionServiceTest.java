package com.penance.pfinance.services;

import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.api.v1.mappers.TransactionMapper;
import com.penance.pfinance.model.Transaction;
import com.penance.pfinance.repositories.TransactionRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

public class TransactionServiceTest {

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

}
