package basics;

public class CodingExercises {
	public static void main(String[] args) 
	{
		
	System.out.println(positiveNegativeZero (-1));
	System.out.println(speedConverter (-100));
	shouldWakeup (true, 1);
	shouldWakeup (false, 2);
	shouldWakeup (true , 8);
	shouldWakeup (true , -1);
	printMegaBytesAndKiloBytes(2500);
	System.out.println(isLeapYear(-1600));
	System.out.println(isLeapYear(1600));
	System.out.println(isLeapYear(2000));
	System.out.println(isLeapYear(2017));
	System.out.println(isLeapYear(1700));
	hasEqualSum(1, -1, 0);
	System.out.println(isLeapYear(1700));
	
	System.out.println(hasEqualSum(1, -12, 0));
	System.out.println(hasTeen(1, 12, 13));
	}
	public static String positiveNegativeZero (float number){
	String 	result = "zero";
		if(number>0) {
			result = "Positive";
			}else if(number<0) {
				result = "negative";
			}
		return result;
		

		
	}
	public static long speedConverter(float kmph){
		long speed=-1;
		if (kmph<0) {
			return speed;
		}else {
		
		
		 speed=(long) (kmph*0.621371);
		return speed;
		
		}	}

		public static void shouldWakeup(boolean barking,int atHour){
			boolean wakeup =false;
			 if (barking==false) {
				 System.out.println(wakeup +" dog is not barking");
				 
			 }
				 else if (atHour<0 || atHour >23) {
				System.out.println("duration od the day is 0 to 23");	
			}
				 else if (atHour>=8  ) {
					 
					 System.out.println( wakeup + " since its not before 8");
					 
				 }
                else if ( atHour >22 ) {
					 
					 System.out.println( wakeup + " since its not after 23");
					 
				 }
                else {
                	wakeup=true;
                	 System.out.println( wakeup  );
                	
                }
			 
		
			
		
			
		}
		 public static void printMegaBytesAndKiloBytes(int kilobytes){
			 int megabytes = kilobytes/1000;
			 int remainingKb=kilobytes%1000;
			 System.out.println( kilobytes +" KB = "+ megabytes +" MB and "+remainingKb +" KB "  );
			 
		 }
		 public static boolean isLeapYear(int year) {
			 boolean result=false;
			 if (year<1 || year>9999) {
				 return result;
				 
			 }else if (year%100==0 && year%400!=0 ){
				 return result;
			 }else if (year%100==0 && year%400==0 ){
				 result=true;
				 return result;
			 }
			 else if (year%100!=0 && year%4==0) {
				 result=true;
				 return result;
			 }
			 else {
				 return result;
			 }
			 
		 }
		 
		 public static boolean areEqualByThreeDecimalPlaces(double num1,double num2) {
			boolean result=false;
			 int numb1=(int)(num1*1000);
			 int numb2=(int)(num2*1000);
			 if (numb1==numb2) {
				 result=true;
				 
			 }
			 return result;
			 
		 }
		 
		 public static boolean hasEqualSum(int num1,int num2,int num3) {
			boolean result=false;
					 if (num1+num2==num3) {
						 result=true;
					 }
					 return result;
			 
		 }
		 public static boolean hasTeen(int person1,int person2,int person3) {
		 boolean result=false;
		 if((person1<20&&person1>12)||(person2<20&&person2>12)||(person3<20&&person3>12)) {
			 result=true;
		 }
		 return result;
		 }

}
