package bankAccountApp;

import java.text.NumberFormat;

public class Checking {
	private double balance = 0.00;

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void printBalanceTooLow(double amount) {
		System.out.println("Checking account balance is "+formatCheckingBalance()+
				" and too low to withdraw "+amount+".");
	}
	
	public void withdraw(double amount) {
		if (balance - amount > 0) {
			balance = balance - amount;
		}
		else {
			printBalanceTooLow(amount);
		}
	}	
	
	public String formatCheckingBalance() {
		NumberFormat nf = NumberFormat.getInstance(); // get instance
		nf.setMaximumFractionDigits(2); // set decimal places
		return nf.format(balance);
	}

}
