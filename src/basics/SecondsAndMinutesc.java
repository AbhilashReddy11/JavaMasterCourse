package basics;

public class SecondsAndMinutesc {

    public static void main(String[] args) {

        System.out.println(getDurationString(600));  
        System.out.println(getDurationString(65, 45));  
    }

    public static String getDurationString(int seconds) {
    	if (seconds<0) {
    		return"Invalid data";
    		}else
    		{

        int minutes = seconds / 60;
        int remainingSeconds=seconds%60;

        
        return getDurationString(minutes, remainingSeconds);
        }
    }

    public static String getDurationString(int minutes, int seconds) {
    	if (minutes<0) {
    		return"Invalid data";
    		}else if (seconds<=0 && seconds>60) {
    			return"Invalid data";
    		}else {

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";}
    }
}
