package com.penance.pfinance.api.v1.mappers;

import com.penance.pfinance.api.v1.DTO.TransactionDTO;
import com.penance.pfinance.model.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionMapperTest {

    public static final long ID = 1L;
    TransactionMapper transactionMapper = TransactionMapper.INSTANCE;

    @Test
    public void transactionToTransactionDTO() throws Exception {
        Transaction trans = new Transaction();
        trans.setId(ID);
        TransactionDTO transactionDTO = transactionMapper.transactionToTransactionDTO(trans);

        assertEquals(Long.valueOf(ID), transactionDTO.getId());

    }

}
