package codigExercise30;

public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;
	
	
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public double add() {
		return firstNumber+secondNumber;
	}
	public double subtract() {
		return firstNumber-secondNumber;
	}
	public double multiply() {
		return firstNumber*secondNumber;
	}
	public double devide() {
		return firstNumber/secondNumber;
	}
	

}
