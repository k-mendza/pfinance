package com.penance.pfinance.services;

import com.penance.pfinance.api.DTO.ExpenseDTO;
import com.penance.pfinance.api.mappers.ExpenseMapper;
import com.penance.pfinance.repositories.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseMapper expenseMapper;
    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseMapper expenseMapper, ExpenseRepository expenseRepository) {
        this.expenseMapper = expenseMapper;
        this.expenseRepository = expenseRepository;
    }

    @Override
    public List<ExpenseDTO> getAllExpenses() {
        return expenseRepository.findAll()
                .stream()
                .map(expenseMapper::expenseToExpenseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ExpenseDTO getExpenseById(Long id) {
        return expenseMapper.expenseToExpenseDTO(expenseRepository.findById(id).orElse(null));
    }
}
