package com.griffith.SaveTravels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.griffith.SaveTravels.models.Expense;
import com.griffith.SaveTravels.services.ExpenseService;

@RestController
public class ExpenseAPI {
	private final ExpenseService expenseService;

	public ExpenseAPI(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	@RequestMapping("/api/expenses")
	public List<Expense> index(){
		return this.expenseService.allExpenses();
	}
	
	@PostMapping("/api/expenses")
	public Expense create(
			@RequestParam("name") String name,
			@RequestParam("vendor") String vendor,
			@RequestParam("amount") double amount,
			@RequestParam("description") String description
			) {
		Expense newItem = new Expense(name, vendor, amount, description);
		return this.expenseService.createExpense(newItem);
	}
	
	@RequestMapping("/api/expense/{id}")
	public Expense show(@PathVariable("id") Long id) {
		Expense expenseToShow = this.expenseService.findExpense(id);
		return expenseToShow;
	}
}