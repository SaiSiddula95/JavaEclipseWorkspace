package SortAlgos;

import java.util.Scanner;

public class BubbleSortTest {
	
	
	
	public static void main(String[] args) {
		int[] input = getUserInput(10);
		bubbleSort(input);
		printArray(input);		
		
	}
	
	/**
	 * @return
	 */
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
	
	private static void bubbleSort(int[] input) {
		int[] result = new int[input.length];
		
		for(int i = 0;i<input.length;i++) {
			for(int j = i+1; j<input.length;j++) {
				if(input[i]>input[j]) {
					swap(input,i,j);
				}
			}
		}
//		return result;
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
