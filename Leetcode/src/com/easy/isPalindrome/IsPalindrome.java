package com.easy.isPalindrome;

public class IsPalindrome {
	 public static boolean isPalindrome(int x) {
		 boolean result = true;		 
	        String s = String.valueOf(x);	        
	        for(int i=0; i<(Math.ceil(s.length()/2));i++){
	        	System.out.println("Loop: "+i);
	            if(!(s.charAt(i)==s.charAt(s.length()-i-1))) {
	            	result = false;
	            	break;
	            }
	        }
	     
	        return result;
	    }
	 
	 public static void main(String[] args) {
		 int input = 121;
		boolean hello = isPalindrome(input);
		
		System.out.println(hello);
		
	}
}
