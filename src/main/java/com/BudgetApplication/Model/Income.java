package com.BudgetApplication.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Income")
@Component
public class Income {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long incomeId;
	
	float amount;
	
	String remark;
	
	
	@Enumerated(EnumType.STRING)
	private IncomeTypes incomeTypes;
	
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date incomeDate;



	public Income(Long incomeId, float amount, String remark, IncomeTypes incomeTypes, Date incomeDate) {
		super();
		this.incomeId = incomeId;
		this.amount = amount;
		this.remark = remark;
		this.incomeTypes = incomeTypes;
		this.incomeDate = incomeDate;
		
		
	}



	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getIncomeId() {
		return incomeId;
	}



	public void setIncomeId(Long incomeId) {
		this.incomeId = incomeId;
	}



	public float getAmount() {
		return amount;
	}



	public void setAmount(float amount) {
		this.amount = amount;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	public IncomeTypes getIncomeTypes() {
		return incomeTypes;
	}



	public void setIncomeTypes(IncomeTypes incomeTypes) {
		this.incomeTypes = incomeTypes;
	}



	public Date getIncomeDate() {
		return incomeDate;
	}



	public void setIncomeDate(Date incomeDate) {
		this.incomeDate = incomeDate;
	}



	@Override
	public String toString() {
		return "Income [incomeId=" + incomeId + ", amount=" + amount + ", remark=" + remark + ", incomeTypes="
				+ incomeTypes + ", incomeDate=" + incomeDate + "]";
	}



	
	

}
