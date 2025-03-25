package Banking_System;

public abstract class Account {
	
	    protected int accountNumber;
	    protected String accountHolderName;
	    protected double balance;

	    public Account(int accountNumber, String accountHolderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = balance;
	    }

	    public abstract void deposit(double amount);
	    public abstract boolean withdraw(double amount);
	    public double getBalance() { return balance; }
	}


