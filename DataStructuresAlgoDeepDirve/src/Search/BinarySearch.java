package Search;

import java.util.Scanner;

public class BinarySearch {

	
	public static void main(String[] args) {
		Integer i = null;
		if(i==null) {
			System.out.println("Integer is Null");
		}
		int[] input = getUserInput(5);
		int index = recursiveBinarySearch(input,10);
		printArray(input);
		System.out.println("Searched Index and it is in position: "+index);
	}
	
	private static int[] getUserInput(int numberOfInputs) {
		int[] result = new int[numberOfInputs];		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter "+ numberOfInputs+ " digits:");
		
		for(int i = 0; i<numberOfInputs;i++) {
			result[i] = scan.nextInt();
		}
		System.out.println("Input for "+ numberOfInputs+ " digits taken into account");
		return result;	
	}
	

	private static int binarySearch(int[] inputArr, int searchingValue) {
		System.out.println("Inside Binary Search");
		int res = -1;
		
		int start = 0;
		int end = inputArr.length;
		
		while(start<end) {
			int currentIterator = (end+start)/2;
			
			if(searchingValue>inputArr[currentIterator]) {
				start = currentIterator + 1;
			}else if(searchingValue<inputArr[currentIterator]) {
				end = currentIterator;
			}else {//equals to
				return currentIterator; 
			}
		}
		
		return res;
	}
	
	private static int recursiveBinarySearch(int[] input, int value) {
		return recursiveBinarySearch(input,0,input.length,value);
		
	}
	
	public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
		if(start>=end) {
			return -1;
		}
		
		int midpoint = (start+end)/2;
		System.out.println("Midpoint is: "+midpoint);
		if(input[midpoint]==value) {
			return midpoint;
		}else if(input[midpoint]<value) {
			return recursiveBinarySearch(input,midpoint+1,end,value);
		}else {
			return recursiveBinarySearch(input,start,midpoint,value);
		}
		
		
	}
	
	private static void swap(int[] input, int left, int right) {
		int temp = input[left];
		input[left] = input[right];
		input[right] = temp;
	}
	
	private static void printArray(int[] input) {
		for(int i: input) {
			System.out.println(i);
		}
	}	
	
	
}
