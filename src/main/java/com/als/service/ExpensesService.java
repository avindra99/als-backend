package com.als.service;

import com.als.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpensesService {
    private final ExpensesRepository expenseRepository;

    @Autowired
    public ExpensesService(ExpensesRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
}
