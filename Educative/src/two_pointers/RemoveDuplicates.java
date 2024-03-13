package two_pointers;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
		   System.out.println(RemoveDuplicates.remove(arr));
	}
	
	public static int remove(int[] arr) {
		 int nextNonDuplicate = 1; // index of the next non-duplicate element
		    for (int i = 1; i < arr.length; i++) {
		    	System.out.println("Inside For Loop i = "+ i + " with nextNonDuplicatevalue = "+nextNonDuplicate);
		      if (arr[nextNonDuplicate - 1] != arr[i]) {
		        arr[nextNonDuplicate] = arr[i];
		        nextNonDuplicate++;
		      }
		    }
		    System.out.println(Arrays.toString(arr));
		    return nextNonDuplicate;
	}
}


//2, 3, 3, 3, 6, 9, 9
//
//FOr Loops: 3, 3, 3, 6, 9, 9
//
//NextDupArray = 1
//Step 1: if Index 0 != 1 == if 2 != 3
//Set Array[1] = Array[i=1];
//nextDup = 2
//
//Step 2: if Index2 != 1 == if 
//2,2