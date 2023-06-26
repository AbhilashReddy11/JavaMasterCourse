package codingExercise47;

import java.util.ArrayList;




public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	public Bank(String name) {
		super();
		this.name = name;
		this.branches=new ArrayList<>();
	}
	
	public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            branches.add(branch);
            return true;
        }
        return false;
    }

		public boolean addCustomer(String branchName,String customerName, double initialTransaction) {
			Branch branch = findBranch(branchName);
		       if ( findBranch(branchName)!=null) {
		           
		    	   return branch.newCustomer(customerName, initialTransaction);
		           
		            
		        }
		       return false;
		    }
		
		public boolean addCustomerTransaction(String branchName,String customerName, double transaction) {
			Branch branch = findBranch(branchName);
			if (findBranch(branchName)!=null) {
				 return branch.addCustomerTransaction(customerName, transaction);
			
				
			}
			return false;
		}
		
		public Branch findBranch(String branchName) {
			 for (var branch : branches) {
		            if (branch.getName().equalsIgnoreCase(branchName)) {
		                return branch;
		            }
		        }
		     
		        return null;
			
		}
		
		 public boolean listCustomers(String branchName, boolean printTransactions) {
		        Branch branch = findBranch(branchName);
		        if (branch != null) {
		            System.out.println("Customer details for branch " + branch.getName());
		            ArrayList<Customer> customers = branch.getCustomers();
		            for (Customer customer : customers) {
		                System.out.println("Customer: " + customer.getName() + "[" + (customers.indexOf(customer) + 1) + "]");
		                if (printTransactions) {
		                    System.out.println("Transactions");
		                    ArrayList<Double> transactions = customer.getTransactions();
		                    for (Double transaction : transactions) {
		                        System.out.println("[" + (transactions.indexOf(transaction) + 1) + "]  Amount " + transaction);
		                    }
		                }
		            }
		            return true;
		        }
		        return false;
		    }
	

}
class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
	
	
}
class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
	
    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
	
}
