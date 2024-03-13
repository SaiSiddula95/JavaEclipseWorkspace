package two_pointers;

import java.util.Arrays;

public class PairWithTargetSum {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,6};
		System.out.println(Arrays.toString(search(input,20)));
	}

	public static int[] search(int[] arr, int targetSum) {
		int[] output = {-1,-1};
		int startIndex = 0;
		int endIndex = arr.length-1;
		int currentSum = -1;
		
		while(startIndex<endIndex) {
			currentSum = arr[startIndex]+ arr[endIndex];
			if(currentSum==targetSum) {
				output[0] = startIndex;
				output[1] = endIndex;
				return output;
			}else if(currentSum>targetSum) {
				endIndex--;
			}else {
				startIndex++;
			}
		}
		return output;
	}
}
