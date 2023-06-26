package codigExercise30;

public class Main {
	public static void main(String[] args) {
	SimpleCalculator simpleCalculator=new SimpleCalculator();
	simpleCalculator.setFirstNumber(5);
	simpleCalculator.setSecondNumber(4);
	System.out.println("addition = "+simpleCalculator.add());
	System.out.println("subtraction = "+simpleCalculator.subtract());
	System.out.println("miltiplication = "+simpleCalculator.multiply());
	System.out.println("devision = "+simpleCalculator.devide());
	}
}
