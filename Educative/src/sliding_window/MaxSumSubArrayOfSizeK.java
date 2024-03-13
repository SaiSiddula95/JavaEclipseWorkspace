package sliding_window;

public class MaxSumSubArrayOfSizeK {

	// input -> I'm given an array and I'm given a value to find.
	// problem: I need to find the largest sum of K elements.
	// output -> largest sum

	public static int findMaxSumSubArray(int k, int[] arr) {
		int result = 0;
	    int maxSum = 0;
	    int indexCounter = 0;

	    for (int i = 0; i<arr.length;i++){
	    	maxSum += arr[i];

        if (i>k-1){
          System.out.println(i);
	      	maxSum -= arr[indexCounter];
	        indexCounter++;
        }
        
        if(maxSum>result) {
        	result = maxSum;
        }
	    }			
	return result;

  }
}
