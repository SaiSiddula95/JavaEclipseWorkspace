package SortAlgos;

import java.util.Scanner;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] input = getUserInput(7);
		
		printArray(input);
		
		
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
	
	private static void selectionSort(int[] arr) {
		int temp = 0;
		int index = 0;
		for(int i = 0; i<arr.length-1;i++) {
			temp = arr[i];
			index = i;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[j]>arr[i]) { 
					temp = arr[j]; 
					index=j;
				}
				
			}
			
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
