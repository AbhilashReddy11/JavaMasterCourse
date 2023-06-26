package basics;

public class SwitchExpressionChallenge {

    public static void main(String[] args) {

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
        printDayOfaWeek(6);
        printDayOfaWeek(7);
        printDayOfWeek(6);
        printDayOfWeek(7);
       
    }
    //Traditional switch
    public static void printDayOfaWeek(int day) {
    	
    	switch(day) {
    	case 0:
    		System.out.println("sunday");
    		break;
    	case 1:
    		System.out.println("monday");
    		break;
    	case 2:
    		System.out.println("tuesday");
    		break;
    	case 3:
    		System.out.println("wednesday");
    		break;
    	case 4:
    		System.out.println("thursday");
    		break;
    	case 5:
    		System.out.println("friday");
    		break;
    	case 6:
    		System.out.println("saturday");
    		break;
    		default:
    	
        		System.out.println("Invalid day");
    	
    	}
    }
//enchanced switch
    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day) {

        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }

        System.out.println(day + " stands for " + dayOfWeek);
    }
}
