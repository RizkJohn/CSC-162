package labAssignment_5;

public class BankAccount {
	/**current balance in the account*/
	public double balance;
	
	/**number of deposits this month*/
	public int numberOfDeposits;
	
	/**number of withdrawals this month*/
	public int numberOfWithdrawals;
	
	/**annual interest rate*/
	public double annualInterestRate;
	
	/**monthly service charge*/
	public double monthlyServiceCharge;
	
	/**amount that is deposited/withdrawn*/
	public double amount;


	/**allows you to add money to the account
	@param amount the amount to deposit in the account*/
	public void deposit(double amount) {
		balance = balance + amount;
		numberOfDeposits++;
	}

	/**allows you to remove money from the account if
	enough money is available,returns true if the transaction was
	completed, returns false if the there was not enough money.
	@param amount  the amount to withdraw from the account
	@return true if there was sufficient funds to complete
	the transaction, false otherwise*/
	public boolean withdraw(double amount) {
		boolean completed = true;

		if (amount <= balance) {
			balance = balance - amount;
			numberOfWithdrawals++;
		}
		else {
			completed = false;
		}
		return completed;
	}

	/**accessor method to balance
	@return the balance of the account*/
	public double getBalance() {
		return balance;
	}

	/**accessor method to get the number of deposits
	@return the number of deposits this month*/
	public int getNumberOfDeposits() {
		return numberOfDeposits;
	}

	/**accessor method to get the number of withdrawals
	@return the number of withdrawals this month*/
	public int getNumberOfWithdrawals() {
		return numberOfWithdrawals;
	}
	
	/**accessor method to calculate monthly interest
	@return the monthly interest earned*/
	public double calcInterest() {
		double monthlyInterestRate = (annualInterestRate / 12);
		double monthlyInterest = balance * monthlyInterestRate;
		double newBalance = balance + monthlyInterest;
		return monthlyInterest;
	}

	/**mutator method to change the balance
	@param newBalance the new balance for the account*/
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	/**subtracts services charges calls calcInterest method sets 
	number of withdrawals and deposits and service charges to 0*/
	public void monthlyProcess()
	  {
	    calcInterest();
	    numberOfWithdrawals = 0;
	    numberOfDeposits = 0;
	    monthlyServiceCharge = 0;
	  }

}

