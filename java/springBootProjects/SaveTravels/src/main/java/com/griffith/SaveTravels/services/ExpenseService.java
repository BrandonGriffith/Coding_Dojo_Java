package com.griffith.SaveTravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.griffith.SaveTravels.models.Expense;
import com.griffith.SaveTravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepo;
    
    public ExpenseService(ExpenseRepository expenseRepo) {
    	this.expenseRepo = expenseRepo;
    }
    
    public List<Expense> allExpenses() {
       	return (List<Expense>)this.expenseRepo.findAll();
       }
    
    public Expense createExpense(Expense item) {
    	return this.expenseRepo.save(item);
    }
    
    public Expense findExpense(Long id) {
    	return this.expenseRepo.findById(id).orElse(null);
    }
    
    public Expense updateItem(Expense item) {
    	return this.expenseRepo.save(item);
    }
    
    public void deleteItem(Long id) {
    	this.expenseRepo.deleteById(id);
    }
}