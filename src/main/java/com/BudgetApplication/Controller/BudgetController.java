package com.BudgetApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.BudgetApplication.Model.Budget;
import com.BudgetApplication.Model.Expense;
import com.BudgetApplication.Model.Income;
import com.BudgetApplication.Model.Users;
import com.BudgetApplication.Repository.ExpenseRepository;
import com.BudgetApplication.Repository.UserRepository;
import com.BudgetApplication.Service.BudgetApplicationServiceImpl;

@RestController
@RequestMapping("/xpay")
public class BudgetController {
/* Project By Azim T.A */
	
	
	@Autowired
	BudgetApplicationServiceImpl service;

	@Autowired
	ExpenseRepository repository;

	@Autowired
	UserRepository userrepo;

	// Add User to Budget App

	@RequestMapping(value = "/saveUserProfile", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Users> getUser(@RequestBody String user) {

		return ResponseEntity.ok(service.saveUserProfile(user));

	}

	// Add Income
	@RequestMapping(value = "/AddIncome", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Income> addingIncomes(@RequestBody Income income) {

		return ResponseEntity.ok(service.SaveIncome(income));

	}

	// Calculate Budget

	@RequestMapping(value = "/CaluclateBudget", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Budget> BudgeFind(@RequestBody String budget) {

		return ResponseEntity.ok(service.BudgetCaluclation(budget));
	}

	// Add Expense

	@RequestMapping(value = "/AddExpense", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {

		return ResponseEntity.ok(service.addExpenses(expense));

	}

	// Get All Users

	@RequestMapping(value = "/GetAllUser", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Users>> getAllUsers() {

		return ResponseEntity.ok(userrepo.findAll());

	}

	// Get All Expense

	@RequestMapping(value = "/getAllExpense", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Expense>> geExpense2() {

		return ResponseEntity.ok(repository.findAll());

	}

	// Get All Expense Cacheable

//	@RequestMapping(value = "/getExpense", method = RequestMethod.GET, produces = "application/json")
//	public ResponseEntity<List<Expense>> geExpense()  {
//	
//		return ResponseEntity.ok(service.findAllExpense());
//
// 
//	}

}
