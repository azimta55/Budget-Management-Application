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
@Table(name = "Expense")
@Component
public class Expense {
	

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long expenseId;
	
	float expenseAmount;
	
	String remark;
	
	
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	 Date ExpenseDate;
	
	
	
	@Enumerated(EnumType.STRING)
	 PaymentTypes paymentTypes;
	
	
	@Enumerated(EnumType.STRING)
	 CardTypes cardTypes;


	public Expense(Long expenseId, float expenseAmount, String remark, Date expenseDate, PaymentTypes paymentTypes,
			CardTypes cardTypes) {
		super();
		this.expenseId = expenseId;
		this.expenseAmount = expenseAmount;
		this.remark = remark;
		ExpenseDate = expenseDate;
		this.paymentTypes = paymentTypes;
		this.cardTypes = cardTypes;
	}


	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getExpenseId() {
		return expenseId;
	}


	public void setExpenseId(Long expenseId) {
		this.expenseId = expenseId;
	}


	public float getExpenseAmount() {
		return expenseAmount;
	}


	public void setExpenseAmount(float expenseAmount) {
		this.expenseAmount = expenseAmount;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Date getExpenseDate() {
		return ExpenseDate;
	}


	public void setExpenseDate(Date expenseDate) {
		ExpenseDate = expenseDate;
	}


	public PaymentTypes getPaymentTypes() {
		return paymentTypes;
	}


	public void setPaymentTypes(PaymentTypes paymentTypes) {
		this.paymentTypes = paymentTypes;
	}


	public CardTypes getCardTypes() {
		return cardTypes;
	}


	public void setCardTypes(CardTypes cardTypes) {
		this.cardTypes = cardTypes;
	}


	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", expenseAmount=" + expenseAmount + ", remark=" + remark
				+ ", ExpenseDate=" + ExpenseDate + ", paymentTypes=" + paymentTypes + ", cardTypes=" + cardTypes + "]";
	}




	
	
	
	
	
	
	
	
	
	
	

}
