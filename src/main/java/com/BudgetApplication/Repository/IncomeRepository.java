package com.BudgetApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BudgetApplication.Model.Income;




public interface IncomeRepository extends JpaRepository<Income, Long> {
	

	
	@Query("SELECT sum(e.amount) from Income e")
	float sumAmount();
	
}
