package com.penance.pfinance.services;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {

    List<ExpenseDTO> getAllExpenses();

    ExpenseDTO getExpenseById(Long id);

    ExpenseDTO createNewExpense(ExpenseDTO expenseDTO);

    ExpenseDTO saveExpenseByDTO(Long id, ExpenseDTO expenseDTO);

    ExpenseDTO patchExpense(Long id, ExpenseDTO expenseDTO);

    void deleteExpenseById(Long id);
}
