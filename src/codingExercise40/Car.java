package codingExercise40;

public class Car {

	private boolean engine;
	private int cylinder;
	private String name;
	private int wheels;
	public Car(int cylinder, String name) {
		
		this.wheels=4;
		this.engine=true;
		this.cylinder = cylinder;
		this.name = name;
	}
	public void startEngine() {
	
		System.out.println("Car -> startEngine()");
	}
	public void accelerate() {
		System.out.println(" Car -> accelerate()");
	}
	public void brake() {
		System.out.println("Car -> brake()");
		
		
	}
	 public int getCylinder() {
	        return cylinder;
	    }
	 public String getName() {
	        return name;
	    }
	
}

class Mitsubishi extends Car{
	

	public Mitsubishi(int cylinder, String name) {
		super(cylinder, name);
		
		}
	@Override
	public void startEngine() {
		
		System.out.println("Mitsubishi -> startEngine()");
	}
	@Override
	public void accelerate() {
		System.out.println(" Mitsubishi -> accelerate()");
	}
	@Override
	public void brake() {
		System.out.println("Mitsubishi -> brake()");
		
		
	}
	
	
}
class Holden extends Car{
	

	public Holden(int cylinder, String name) {
		super(cylinder, name);
		
		}
	@Override
	public void startEngine() {
		
		System.out.println("Holden -> startEngine()");
	}
	@Override
	public void accelerate() {
		System.out.println(" Holden -> accelerate()");
	}
	@Override
	public void brake() {
		System.out.println("Holden -> brake()");
		
		
	}
	
	
	
}
class Ford extends Car{
	

	public Ford(int cylinder, String name) {
		super(cylinder, name);
		
		
		}
	@Override
	public void startEngine() {
		
		System.out.println("Ford -> startEngine()");
	}
	@Override
	public void accelerate() {
		System.out.println(" Ford -> accelerate()");
	}
	@Override
	public void brake() {
		System.out.println("Ford -> brake()");
		
		
	}
	
		
	
}

