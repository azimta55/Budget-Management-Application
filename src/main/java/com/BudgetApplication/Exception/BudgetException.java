package com.BudgetApplication.Exception;

public class BudgetException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	private String message;

	public BudgetException(String message) {
		super();
		this.message = message;
	}

	public BudgetException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BudgetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BudgetException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BudgetException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
