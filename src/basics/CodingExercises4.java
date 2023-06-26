package basics;

public class CodingExercises4 {

	public static void main(String[] args) {
		System.out.println(sumOdd(13, 15));
		

	}
	public static boolean isOdd(int num) {
		boolean result=false;
		if (num>0 && num%2!=0) {
			result=true;
		}
		return result;
		
		
	}
	public static int sumOdd(int num1,int num2 ) {
		int sum=0;
		if (isOdd(num1)==true && isOdd(num2)==true && num2>=num1) {
			
			for (int i=num1;i<=num2;i+=2) {
				sum+=i;
				
			}
			return sum;
			
		}else {
			return -1;
		}
	}
	

}
