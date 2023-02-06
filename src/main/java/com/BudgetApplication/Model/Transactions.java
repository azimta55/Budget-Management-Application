package com.BudgetApplication.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
 abstract class Transactions {
	

float totalIncome;
float totalExpenses;
	

float budgetBeginning ;

float balance;






	public float calculateExpense() {
		
		
		
		return totalIncome - totalExpenses;
		
	}
	
	
	
	
public float calculateBudget() {
		
		
		
		return budgetBeginning + balance;
		
	}
	
	
	
	
	

}
