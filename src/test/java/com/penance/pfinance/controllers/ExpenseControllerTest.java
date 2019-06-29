package com.penance.pfinance.controllers;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.services.ExpenseService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class ExpenseControllerTest {

    public static final Integer ID = 1;

    @Mock
    ExpenseService expenseService;

    @InjectMocks
    ExpenseController expenseController;

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(expenseController).build();

    }

    @Test
    public void testListCategories() throws Exception {
        ExpenseDTO expense1 = new ExpenseDTO();
        expense1.setId(1l);

        ExpenseDTO expense2 = new ExpenseDTO();
        expense2.setId(2l);

        List<ExpenseDTO> categories = Arrays.asList(expense1, expense2);

        when(expenseService.getAllExpenses()).thenReturn(categories);

        mockMvc.perform(get("/api/expenses/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.expenses", hasSize(2)));
    }

    @Test
    public void testGetByNameCategories() throws Exception {
        ExpenseDTO expense1 = new ExpenseDTO();
        expense1.setId(1l);

        when(expenseService.getExpenseById(anyLong())).thenReturn(expense1);

        mockMvc.perform(get("/api/expenses/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", equalTo(ID)));
    }
    
}
