package codingExercise41;

public class Hamburger {
	
	
	private String name;
	private String meat;
	private double price;
	
	private String breadRollType;
	
	private String addition1Name;
	private String addition2Name;
	private String addition3Name;
	private String addition4Name;
	private double addition1Price;
	private double addition2Price;
	private double addition3Price;
	private double addition4Price;
	
	
	public Hamburger(String name, String meat, double price, String breadRollType) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
	}
	public void addHamburgerAddition1(String addition1Name,double addition1Price) {
		this.addition1Price=addition1Price;
		this.addition1Name=addition1Name;
		
		System.out.println( "Added " +addition1Name+"  for an extra " + addition1Price);
		
	}
	public void addHamburgerAddition2(String addition2Name,double addition2Price) {
		this.addition2Price=addition2Price;
		this.addition2Name=addition2Name;
		System.out.println( "Added " +addition2Name+"  for an extra " + addition2Price);
		
	}
	public void addHamburgerAddition3(String addition3Name,double addition3Price) {
		this.addition3Price=addition3Price;
		this.addition3Name=addition3Name;
		System.out.println( "Added " +addition3Name+"  for an extra " + addition3Price);
		
	}
	public void addHamburgerAddition4(String addition4Name,double addition4Price) {
		this.addition4Price=addition4Price;
		this.addition4Name=addition4Name;
		System.out.println("Added " +addition4Name+"  for an extra " + addition4Price);
		
	}
	public double itemizeHamburger() {
		double total=price+addition1Price+addition2Price+addition3Price+addition4Price;
		
		return total;
	}


}
