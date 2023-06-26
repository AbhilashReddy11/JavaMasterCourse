package arrays;

import java.util.Arrays;

public class ArraysChallenge {

	public static void main(String[] args) {
		int[] array= {20,20,12,34,50,10};
		for (int i : array) {
		System.out.print(i+" ");
		}
		System.out.print("\nsorted array:");
		Arrays.sort(array);
		for (int i : array) {
			System.out.print(" " +i);
			
			}
		System.out.print("\ndescending order:");
		for(int i=array.length-1;i>+0;i--) {
			System.out.print(" " +array[i]);	
		}
		
		

	}

}
