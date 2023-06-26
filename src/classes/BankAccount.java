package classes;

public class BankAccount {
	 private int  accountNumber;
	 private double accountBalance;
	 private String customerName;
	 private String emailID;
	 private int phoneNumber;
	 public BankAccount() {
	        this(56789, 2.50, "Default name",
	                "Default address", 123456);
	        System.out.println("Empty constructor called");
	    }
	

		public BankAccount(int number, double balance, String customerName, String customerEmail,
	                   int customerPhone) {
	        System.out.println("Account constructor with parameters called");
	        this.accountNumber = number;
	        this.accountBalance = balance;
	        this.customerName = customerName;
	        customerEmail = emailID;
	        customerPhone = phoneNumber;
	    }

//	    public Account(String customerName, String customerEmail, String customerPhone) {
//	        this("99999", 100.55, customerName, customerEmail, customerPhone);
//	        this.customerName = customerName;
//	        this.customerEmail = customerEmail;
//	        this.customerPhone = customerPhone;}
	    

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void withdraw(float withdrawlAmount) {
		if (withdrawlAmount<=0) {
			System.out.println("withdrawl amount should be more than 0");
		}else if (withdrawlAmount>accountBalance){
			System.out.println("insuffient funds");
		}else {
		this.accountBalance = accountBalance-withdrawlAmount;
	}
		}
	public void deposit(float depositingAmount) {
		if (depositingAmount<=0) {
			System.out.println("depositingAmount should be more than 0");
		}else {
		this.accountBalance = accountBalance+depositingAmount;
	}
		}
	
	 

}
