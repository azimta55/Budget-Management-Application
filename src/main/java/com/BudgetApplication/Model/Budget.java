package com.BudgetApplication.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Budget")
@Component
public class Budget extends  Transactions {
	
	
	/* Project By Azim T.A */	


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long budgetId;
	
	String budgetName;
	
	//float budgetBeginning ;
	
	float budgetEnd;
	
	float actualBudget;
	
	float estimatedIncome;
	
	float estimatedExpense;
	
	float estimatedBudget;
	
	//float balance;
	
	String remark;
	
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	Date budgetStartDate;
	 
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Date budgetEndDate;



		
	
	
public Budget(Long budgetId, String budgetName, float budgetEnd, float actualBudget, float estimatedIncome,
			float estimatedExpense, float estimatedBudget, String remark, Date budgetStartDate, Date budgetEndDate,float totalIncome,float totalExpenses,float budgetBeginning,float balance) {
		super();
		this.budgetId = budgetId;
		this.budgetName = budgetName;
		this.budgetEnd = budgetEnd;
		this.actualBudget = actualBudget;
		this.estimatedIncome = estimatedIncome;
		this.estimatedExpense = estimatedExpense;
		this.estimatedBudget = estimatedBudget;
		this.remark = remark;
		this.budgetStartDate = budgetStartDate;
		this.budgetEndDate = budgetEndDate;
		this.totalIncome = totalIncome;
		this.totalExpenses = totalExpenses;
		this.budgetBeginning=budgetBeginning;
		this.balance=balance;
	}

 



//	public void updateBudget(float estimatedIncome, float estimatedExpense) {
//		    this.estimatedIncome = estimatedIncome;
//		    this.estimatedExpense = estimatedExpense;
//		    this.estimatedBudget = estimatedIncome - estimatedExpense;
//		    this.budgetBeginning = this.budgetEnd;
//		    this.budgetEnd = this.budgetBeginning + this.estimatedBudget;
//		    this.balance = this.budgetEnd - this.budgetBeginning;
//		  }
//
//	 
//	 public void printBudget() {
//		    System.out.println("Budget Name: " + budgetName);
//		    System.out.println("Budget Beginning: " + budgetBeginning);
//		    System.out.println("Total Incomes: " + totalIncome);
//		    System.out.println("Total Expenses: " + totalExpenses);
//		    System.out.println("Budget End: " + budgetEnd);
//		    System.out.println("Actual Budget: " + actualBudget);
//		    System.out.println("Estimated Income: " + estimatedIncome);
//		    System.out.println("Estimated Expense: " + estimatedExpense);
//		    System.out.println("Estimated Budget: " + estimatedBudget);
//		    System.out.println("Balance: " + balance);
//		  }

	public Budget() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getBudgetId() {
		return budgetId;
	}


	public void setBudgetId(Long budgetId) {
		this.budgetId = budgetId;
	}


	public String getBudgetName() {
		return budgetName;
	}


	public void setBudgetName(String budgetName) {
		this.budgetName = budgetName;
	}


	public float getBudgetBeginning() {
		return budgetBeginning;
	}


	public void setBudgetBeginning(float budgetBeginning) {
		this.budgetBeginning = budgetBeginning;
	}


	public float getBudgetEnd() {
		return budgetEnd;
	}


	public void setBudgetEnd(float budgetEnd) {
		this.budgetEnd = budgetEnd;
	}


	public float getActualBudget() {
		return actualBudget;
	}


	public void setActualBudget(float actualBudget) {
		this.actualBudget = actualBudget;
	}


	public float getEstimatedIncome() {
		return estimatedIncome;
	}


	public void setEstimatedIncome(float estimatedIncome) {
		this.estimatedIncome = estimatedIncome;
	}


	public float getEstimatedExpense() {
		return estimatedExpense;
	}


	public void setEstimatedExpense(float estimatedExpense) {
		this.estimatedExpense = estimatedExpense;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Date getBudgetStartDate() {
		return budgetStartDate;
	}


	public void setBudgetStartDate(Date budgetStartDate) {
		this.budgetStartDate = budgetStartDate;
	}


	public Date getBudgetEndDate() {
		return budgetEndDate;
	}


	public void setBudgetEndDate(Date budgetEndDate) {
		this.budgetEndDate = budgetEndDate;
	}


	
	
	
	
	
	public float getEstimatedBudget() {
		return estimatedBudget;
	}


	public void setEstimatedBudget(float estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
	}


	public float getTotalIncome() {
	    return totalIncome;
	  }
	  
	  public void setTotalIncome(float totalIncome) {
	    this.totalIncome = totalIncome;
	  }
	  
	  public float getTotalExpenses() {
	    return totalExpenses;
	  }
	  
	  public void setTotalExpenses(float totalExpenses) {
	    this.totalExpenses = totalExpenses;
	  }
	  
	  
	  
	  
	  
	  
	
	
	  
	  
	  
	  
	  
	  
	
	@Override
	public String toString() {
		return "Budget [budgetId=" + budgetId + ", BudgetName=" + budgetName + ", budgetBeginning=" + budgetBeginning
				+ ", budgetEnd=" + budgetEnd + ", actualBudget=" + actualBudget + ", estimatedIncome=" + estimatedIncome
				+ ", estimatedExpense=" + estimatedExpense + ", balance=" + balance + ", remark=" + remark
				+ ", budgetStartDate=" + budgetStartDate + ", budgetEndDate=" + budgetEndDate + "]";
	}




	

	
	
	
	
	
	

	
	
	

	

}
