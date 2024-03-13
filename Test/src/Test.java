
public class Test {
	
	 public static boolean isPalindrome(int x) {
	        if(x < 0) return false; //returns negative as false
	        int y = x;
	        int res = 0;
	        while(y != 0) {
	            res = res * 10 + y % 10;
	            y /= 10;
	        }
	        return x == res;
	    }
	 
	public static void main(String[] args) {
		//System.out.println(isPalindrome(121221));
		
		boolean b = false;
		
		
		
	}
	
	
	public static int largestOdd(int[] arr) {
		int largestInt = Integer.MIN_VALUE;
		
		
		
		for(int i = 0; i<arr.length; i++) {
			
		}
		
		return largestInt;
	}
	
	
}
