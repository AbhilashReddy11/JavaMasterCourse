package basics;

public class CodingExercises3 {

	public static void main(String[] args) {
		printNumberinWord(10);
		numberOfDaysinaMonth(13,2000);

	}
	 public static void printNumberinWord(int number) {
	    	
	    	switch(number) {
	    	case 0:
	    		System.out.println("Zero");
	    		break;
	    	case 1:
	    		System.out.println("one");
	    		break;
	    	case 2:
	    		System.out.println("two");
	    		break;
	    	case 3:
	    		System.out.println("three");
	    		break;
	    	case 4:
	    		System.out.println("four");
	    		break;
	    	case 5:
	    		System.out.println("five");
	    		break;
	    	case 6:
	    		System.out.println("six");
	    		break;
	    	case 7:
	    		System.out.println("seven");
	    		break;
	    	case 8:
	    		System.out.println("eight");
	    		break;
	    	case 9:
	    		System.out.println("nine");
	    		break;
	    		default:
	    	
	        		System.out.println("other ");
	    	
	    	}
	    }
	 
	 
	 public static void numberOfDaysinaMonth(int month,int year) {
		boolean isleapYear= isLeapYear( year);
		
			switch (month) {
			case 1 :case 3:case 5:case 7:case 8: case 10:case 12:
			System.out.println("31");
			break;
			
			case 2:
				if(isleapYear) {
					System.out.println("29");
				}else {
					System.out.println("28");
				}
				break;
			case 4:case 6:case 9:case 11:
				System.out.println("31");
				break;
				default :
				
					System.out.println("invalid");
			
				
			
			
			
		}
		 
	 }
	 
	
		    public static boolean isLeapYear(int year) {
		        if (year < 1 || year > 9999) {
		            return false;
		        }

		        boolean leapYear;

		       
		        switch (year % 400) {
		            case 0:
		                leapYear = true;
		                break;
		            default:
		                switch (year % 100) {
		                    case 0:
		                        leapYear = false;
		                        break;
		                    default:
		                        leapYear = year % 4 == 0;
		                }
		        }

		        return leapYear;
		    }



}
