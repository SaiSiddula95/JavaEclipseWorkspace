
public class Test {
	public static void main(String[] args) {
		 int[] result = makeSquares(new int[] { -2, -1, 0, 2, 3 });
		    for (int num : result)
		      System.out.print(num + " ");
		    System.out.println();
	}
	
	public void slidingWindow(int[] input) {
		
		
		for(int i = 0; i< input.length; i++) {
			
			
			
			
			
		}
		
		
		
	}
	
	  public static int[] makeSquares(int[] arr) {
		    int[] squares = new int[arr.length];
		    int left = 0;
		    int right = arr.length-1;
		    int highestIndex = arr.length -1;
		    
		    while(left<=right){
		    	int leftValue = arr[left] * arr[left];
		    	int rightValue = arr[right] * arr[right];
		      
		      if(leftValue>rightValue){
		    	  
		        squares[highestIndex--] = leftValue;
		        left++;
		      }else{
		        squares[highestIndex--] = rightValue;
		        right--;
		      }
		    }

		    return squares;
	}
	  
	  public static int[] makeSquares2(int[] arr) {
		    int[] squares = new int[arr.length];
		    int highestSquareIdx = arr.length - 1;
		    int left = 0, right = arr.length - 1;
		    while (left <= right) {
		      int leftSquare = arr[left] * arr[left];
		      int rightSquare = arr[right] * arr[right];
		      if (leftSquare > rightSquare) {
		        squares[highestSquareIdx--] = leftSquare;
		        left++;
		      } else {
		        squares[highestSquareIdx--] = rightSquare;
		        right--;
		      }
		    }
		    return squares;
		  }
	
	
}
