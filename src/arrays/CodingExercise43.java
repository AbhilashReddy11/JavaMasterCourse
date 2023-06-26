package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CodingExercise43 {
	public static void main(String[] args)
	{
   int[] arr= {1,2,3,4};
		reverse(arr);
    	
    	
    	
    	
    	
  }

    public static void reverse(int[] array) {
    
    	System.out.println("Array = "+Arrays.toString(array));
    	
     
       for (int i = 0; i < array.length/2; i++) {
    	   int temp = array[i];
    	   array[i] = array[array.length - 1 - i];
    	   array[array.length - 1 - i] = temp;
           }
       
       
   	System.out.println("Reversed Array = "+Arrays.toString(array));
     
     
    }

} 
    
   