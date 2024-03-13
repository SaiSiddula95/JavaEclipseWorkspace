package sliding_window;

public class MinSizeSubArraySum {
	
	
	public static void main(String[] args) {
		int[] input = {2, 1, 5, 2, 8};
		int result = findMinSubArray(8,input);
		System.out.println(result);
		System.out.println(Math.min(10, 1));
	}
	
	
	public static int findMinSubArray(int S, int[] arr) {
	    // TODO: Write your code here
		int currentSum = 0;
		int lowestLength = arr.length+1;
		int leftWindow = 0;
		
		for(int i = 0; i<arr.length; i++) {
			currentSum += arr[i];
			
			while(currentSum>=S) {
				lowestLength = Integer.min(lowestLength, i-leftWindow+1);
				currentSum-= arr[leftWindow];
				leftWindow++;
			}
			
		}
		
		
	    return lowestLength;
	  }
	
	// 2,1,5,2,3,2 ; S = 7
}
