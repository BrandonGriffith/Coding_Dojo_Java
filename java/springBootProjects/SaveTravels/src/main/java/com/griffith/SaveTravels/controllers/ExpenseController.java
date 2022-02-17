package com.griffith.SaveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.griffith.SaveTravels.models.Expense;
import com.griffith.SaveTravels.services.ExpenseService;

@Controller
public class ExpenseController {
	private final ExpenseService expenseService;

	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
	@RequestMapping("/expenses")
	public String index(Model model){
		System.out.println(this.expenseService.allExpenses());
		List<Expense> allExpenses = this.expenseService.allExpenses();
		model.addAttribute("allExpenses", allExpenses);
		model.addAttribute("expense", new Expense());
		return "index.jsp";
	}
	
	@RequestMapping("/expense/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Expense expense = this.expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "showOneExpense.jsp";
	}
	
	@PostMapping("/expense/create")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> allExpenses = this.expenseService.allExpenses();
			model.addAttribute("allExpenses", allExpenses);
			return "index.jsp";
		}else {
			this.expenseService.createExpense(expense);
			return "redirect:/";
		}	
	}
	
	@RequestMapping("/expense/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expenseToEdit = this.expenseService.findExpense(id);
		model.addAttribute("expenseToEdit", expenseToEdit);
		return "edit.jsp";
	}
	
	@PutMapping("/expense/update/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("expenseToEdit") Expense expenseEdit, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			this.expenseService.updateItem(expenseEdit);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/expense/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.expenseService.deleteItem(id);
		return "redirect:/";
	}
}