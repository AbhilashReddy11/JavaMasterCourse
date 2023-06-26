package codingExercise34;

public class Calculator {
	private Floor floor;
	private Carpet carpet;
	public Calculator(Floor floor, Carpet carpet) {
		super();
		this.floor = floor;
		this.carpet = carpet;
	}
public double getTotalCost() {
	double a=carpet.getCost();
	double b=floor.area();
	return a*b;
	
}

}
