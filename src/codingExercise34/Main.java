package codingExercise34;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		double cost=0;
		double length=0;
		 double width=0;
		 boolean isValidInput=false;
		
		 while (!isValidInput) {
		 try {
			 System.out.println("enter the cost of carpet prt 1sq.meters:");
	            cost = scanner.nextDouble();
	            System.out.println("enter the width of the floor:");
	            width = scanner.nextDouble();
	            System.out.println("enter the length of the floor:");
	            length = scanner.nextDouble();
	            isValidInput=true;
	        } catch (Exception e) {
	            System.out.println("Invalid input! Please enter a number.");
	            scanner.nextLine();
	        }
		 }
		
		Carpet carpet = new Carpet(cost);
		Floor floor = new Floor(length, width);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("total cost of carpet required= " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
		scanner.close();
	}

}
