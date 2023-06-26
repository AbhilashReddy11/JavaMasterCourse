package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CodingExercise44 {
	public static void main(String[] args)
	{
   
		int a=readInteger();
	int[] arr =readElements(a);
	System.out.println("min = " +findMin(arr));
		
    	
    	
    	
    	
    	
  }

    public static int findMin(int[] array) {
     //  array=readElements(readInteger()) ;
       int min = array[0];
       for (int i = 1; i < array.length; i++) {
           if (array[i] < min) {
               min = array[i];
           }
       }
       return min;

     
    }

    public static int[] readElements(int count) {
        int[] elements = new int[count];
        System.out.println("Enter " + count + " elements:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;
    }
    
    
    public static int readInteger() {
    	 Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the size of the array: ");
         int size = scanner.nextInt();
         return size;
    	
    }
}
   

