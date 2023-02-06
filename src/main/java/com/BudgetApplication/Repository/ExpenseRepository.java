package com.BudgetApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BudgetApplication.Model.Expense;



public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
	@Query("SELECT sum(e.expenseAmount) from Expense e")
	float sumexpenseAmount();

}
