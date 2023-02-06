package com.BudgetApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BudgetApplication.Model.Budget;
import com.BudgetApplication.Model.Expense;
import com.BudgetApplication.Model.Income;
import com.BudgetApplication.Model.Users;
import com.BudgetApplication.Repository.BudgetRepository;
import com.BudgetApplication.Repository.ExpenseRepository;
import com.BudgetApplication.Repository.IncomeRepository;
import com.BudgetApplication.Repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BudgetApplicationServiceImpl {
	/* Project By Azim T.A */
	
	@Autowired
	BudgetRepository budgetRepository;

	@Autowired
	ExpenseRepository expenseRepository;

	@Autowired
	IncomeRepository incomeRepository;

	@Autowired
	UserRepository userRepository;

	public Users saveUserProfile(String user) {

		Users users = new Users();
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			users = objectMapper.readValue(user, Users.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		userRepository.save(users);

		return users;

	}

	public Income SaveIncome(Income income) {

		incomeRepository.save(income);

		return income;
	}

	public Budget BudgetCaluclation(String budget) {

		Budget bugets = new Budget();

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			bugets = objectMapper.readValue(budget, Budget.class);

			// bugets =budgetRepository.findById(bugets.getBudgetId()).get();

			System.out.println(bugets);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		float expense = expenseRepository.sumexpenseAmount();
		float incomes = incomeRepository.sumAmount();

		// Budget at the end = Budget at the beginning + Total Inflows - Total Outflows

		float budgetending = 0;

		float beginingbudget = bugets.getBudgetBeginning();

		float estimatingBudget = 0;

		float actualbudgeting = bugets.getActualBudget();

		float estimatedIncomes = bugets.getEstimatedIncome();

		float estimatedExpenses = bugets.getEstimatedExpense();

		budgetending = beginingbudget + incomes - expense;

		estimatingBudget = actualbudgeting + estimatedIncomes - estimatedExpenses;

		System.out.println("Estimated Budget = " + estimatingBudget);

		bugets.setBudgetEnd(budgetending);
		bugets.setTotalExpenses(expense);
		bugets.setTotalIncome(incomes);
		bugets.setEstimatedBudget(bugets.getEstimatedBudget());

		bugets.setBalance(bugets.calculateExpense());

		bugets.setBudgetBeginning(bugets.calculateBudget());

		System.out.println("Beginging Budget = " + beginingbudget);

		budgetRepository.save(bugets);

		System.out.println("The expense for " + bugets.getBudgetName() + " is: $" + bugets.getBalance());

		return bugets;

	}

	// Cache Written onto File
//	@Cacheable(value ="Expense",key = "'mykey'")  
//	public List<Expense> findAllExpense() {
//		
//		
//		try {
//			//newFile = new File(dir, "CacheRecord" + ".txt");
//			//newFile.createNewFile();
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	
//		List<Expense> expense =	expenseRepository.findAll();
//		
//		
//		
//		 List<Expense> data = cacheData.get("'mykey'");
//	      if (data == null) {
//	    	 // data = expense;
//	         data = expenseRepository.findAll();
//	         cacheData.put("'mykey'", data);
//	      }
//	      
//	      System.out.println(cacheData);
//	      
//	      
//	      try (PrintWriter out = new PrintWriter(newFile)) {
//	          out.println((cacheData));
//	      } catch (Exception e1) {
//	          throw new RuntimeException(e1);
//	      }
//	  
//		
//		return expense;
//	}

	public Users findUsers(Long userId) {

		Users user = userRepository.findById(userId).get();

		return user;
	}

	public Expense addExpenses(Expense expense) {

		expenseRepository.save(expense);

		return expense;
	}

}
