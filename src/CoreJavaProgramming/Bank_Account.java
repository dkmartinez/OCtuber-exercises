package CoreJavaProgramming;

public class Bank_Account {
	
	

	private int accountNumber;
	private String accountName;
	private double accountBalance;
	
	public void deposit(double ammount) {
		accountBalance += ammount;
		System.out.println("Hello, " + accountName + " Your actual balance is " + accountBalance + " your account is " + accountNumber);
		
	}
	
	public Bank_Account(int accountNumber, String accountName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
}
