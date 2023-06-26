package autoBoxingUnBoxing;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Customer> customers= new ArrayList<>(5000);
	
	 public Bank(String name) {
	        this.name = name;
	    }
	 @Override
	    public String toString() {
	        return "Bank{" +
	                "name='" + name + '\'' +
	                ", customers=" + customers +
	                '}';
	    }
	
	  private Customer getCustomer(String customerName) {

	        for (var customer : customers) {
	            if (customer.getName().equalsIgnoreCase(customerName)) {
	                return customer;
	            }
	        }
	        System.out.printf("Customer (%s) wasn't found %n", customerName);

	        return null;
	    }

	    public void addNewCustomer(String customerName, double initialDeposit) {
	    	
	       if (getCustomer(customerName) == null) {
	            Customer customer = new Customer(customerName, initialDeposit);
	            customers.add(customer);
	            System.out.println("New Customer added: " + customer);
	        }
	    }

	    public void addTransaction(String name, double transactionAmount) {

       Customer customer = getCustomer(name);
	    	
	        if (customer != null) {
	            customer.getTransactions().add(transactionAmount);
	        }
	    }

	    public void printStatement(String customerName) {

	        Customer customer = getCustomer(customerName);
	        if (customer == null) {
	            return;
	        }

	        System.out.println("-".repeat(30));
	        System.out.println("Customer Name: " + customer.getName());
	        System.out.println("Transactions:");
	        for (double d : customer.getTransactions()) {  // unboxing
	            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
	        }

	    }



}
class Customer {
	private String name;
	private ArrayList<Double> transactions;
	 
	public Customer(String name,double initialDeposit) {
		 this.name = name.toUpperCase();
		 this.transactions = new ArrayList<>(500);
	        transactions.add(initialDeposit);
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", transactions=" + transactions + "]";
	}

	public String getName() {
		return name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	
}
