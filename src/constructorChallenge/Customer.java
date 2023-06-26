package constructorChallenge;

public class Customer {
	private String name;
	private double creditLimit;
	private String email;
	public Customer(String name, double creditLimit, String email) {
		
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	public Customer() {
		this("abhi",20000,"abhi@gmail");
	}
	public Customer( String name,String email) {
		this(name,20000,email);
	}
	
}
