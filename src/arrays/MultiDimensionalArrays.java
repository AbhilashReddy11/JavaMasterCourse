package arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		//Two Dimensional Arrays
		int[][] array=new int[2][5];
				for(int[] arr:array) {
			System.out.println(Arrays.toString(arr));
		}
				//Multi Dimensional Arrays
				 array[1] = new int[] {10, 20, 30};
			        System.out.println(Arrays.deepToString(array));

			        Object[] anyArray = new Object[3];
			        System.out.println(Arrays.toString(anyArray));

			        anyArray[0] = new String[] {"a", "b", "c"};
			        System.out.println(Arrays.deepToString(anyArray));

			        anyArray[1] = new String[][]{
			                {"1", "2"},
			                {"3", "4", "5"},
			                {"6", "7", "8", "9"}
			        };
			        System.out.println(Arrays.deepToString(anyArray));

//        anyArray[2] = new int[2][2][2];
////			        anyArray[2] = "Hello";
//			        System.out.println(Arrays.deepToString(anyArray));
//
//			        for (Object element : anyArray) {
//			            System.out.println("Element type = " + element.getClass().getSimpleName());
//			            System.out.println("Element toString() = " + element);
//			            System.out.println(Arrays.deepToString((Object[]) element));
//			        }
//				
//				Object[] multi=new Object[3][];
//				
	}

}
