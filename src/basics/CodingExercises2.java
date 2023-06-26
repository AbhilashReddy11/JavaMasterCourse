package basics;

public class CodingExercises2 {

	public static void main(String[] args) {
		System.out.println(area(-20));
		printYearsAndDays(561600);
		printEqual(2, 4, 1);
		System.out.println(isCatPlaying(true, 44));
		

	}
	public static double area(double radius) {
		if (radius<0) {
			return -1;
		}else {
		return 3.14*radius * radius;}
	}
	public static int area(int x,int y) {
		if (x<0 || y<0) {
			return-1;
		}else {
		return x*y;}
		
	}
	public static void printYearsAndDays(int minutes) {
		if (minutes<0) {
			System.out.println("Invalid value");
		}else {
		int	hours=minutes/60;
			int remainingMinutes=minutes%60;
			int days=hours/24;
			int remainingHours=hours%24;
			int years=days/365;
			int remainingDays=days%365;
			System.out.println(years+"years "+remainingDays+"Days "+remainingHours+"Hours "+remainingMinutes+"Minutes ");
			
		}
		}
		
		public static void printEqual(int num1,int num2,int num3){
			if (num1<0 || num2<0 || num3<0) {
				System.out.println("invalid text");
			}
			else if (num1==num2 && num1==num3) {
				System.out.println("all numbers are equal");
			}else if (num1!=num2 && num1!=num3 &&num2!=num3) {
				System.out.println("All numbers are different");
				
			}
			else {
				
				System.out.println(" Neither all are equal or different");
			}
		}
		
		public static boolean isCatPlaying(boolean isSummer,int temperature) {
			boolean result=false;
			if(isSummer) {
				if(temperature<46 && temperature>24) {
					result=true;
				}
			}
			if(!isSummer)  {
				if(temperature<36 && temperature>24) {
					result=true;
				}
			}
			return result;
		}
	

}
