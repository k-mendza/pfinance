package com.penance.pfinance.api.mappers;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.model.Expense;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpenseMapperTest {

    public static final long ID = 1L;
    ExpenseMapper expenseMapper = ExpenseMapper.INSTANCE;

    @Test
    public void expenseToExpenseDTO() throws Exception {
        Expense expense = new Expense();
        expense.setId(ID);
        ExpenseDTO expenseDTO = expenseMapper.expenseToExpenseDTO(expense);

        assertEquals(Long.valueOf(ID),expenseDTO.getId());

    }

}
