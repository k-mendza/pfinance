package com.penance.pfinance.services;

import com.penance.pfinance.model.Expense;
import com.penance.pfinance.repositories.ExpenseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService implements CrudService<Expense, Long> {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Iterable<Expense> findAll(){
        return this.expenseRepository.findAll();
    }

    @Override
    public Expense findById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    @Override
    public Expense save(Expense object) {
        return expenseRepository.save(object);
    }

    @Override
    public void delete(Expense object) {
        expenseRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        expenseRepository.deleteById(id);
    }
}
