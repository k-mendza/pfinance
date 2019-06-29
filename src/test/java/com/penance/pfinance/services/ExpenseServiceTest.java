package com.penance.pfinance.services;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.api.mappers.ExpenseMapper;
import com.penance.pfinance.model.Expense;
import com.penance.pfinance.repositories.ExpenseRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

public class ExpenseServiceTest {

    ExpenseService expenseService;

    @Mock
    ExpenseRepository expenseRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        expenseService = new ExpenseServiceImpl(ExpenseMapper.INSTANCE, expenseRepository);
    }

    @Test
    public void getAllExpenses() throws Exception {

        //given
        List<Expense> expenses = Arrays.asList(new Expense(), new Expense(), new Expense());

        when(expenseRepository.findAll()).thenReturn(expenses);

        //when
        List<ExpenseDTO> expenseDTOS = expenseService.getAllExpenses();

        //then
        assertEquals(3, expenseDTOS.size());
    }

}
