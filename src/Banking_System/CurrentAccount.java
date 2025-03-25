package Banking_System;


	class CurrentAccount extends Account {
	    private double overdraftLimit;

	    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
	        super(accountNumber, accountHolderName, balance);
	        this.overdraftLimit = overdraftLimit;
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    @Override
	    public boolean withdraw(double amount) {
	        if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }
	}



