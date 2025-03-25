package Banking_System;


	class SavingsAccount extends Account {
	    private double interestRate;

	    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
	        super(accountNumber, accountHolderName, balance);
	        this.interestRate = interestRate;
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    @Override
	    public boolean withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }
	}



