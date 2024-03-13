package sliding_window.medium;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {
	
	public static void main(String[] args) {
		char[] input ={'A', 'B', 'C', 'A', 'C'};
		System.out.println(findLength(input));
		
	}
	
	
	public static int findLength(char[] arr) {
		int maxLength = 0;
		Map<Character, Integer> fruitMapper = new HashMap<Character, Integer>();
		int leftWindow = 0;
		
		for(int i = 0; i<arr.length;i++) {

			fruitMapper.put(arr[i], fruitMapper.getOrDefault(arr[i], 0)+1);			
			while(fruitMapper.size()>=2) {
				char leftFruit = arr[leftWindow];
				fruitMapper.put(leftFruit, fruitMapper.get(leftFruit)-1);
				if(fruitMapper.get(leftFruit)==0) fruitMapper.remove(leftFruit);
			}			
			maxLength = Integer.max(maxLength, i-leftWindow+1);
		}		
		return maxLength;
	  }
}
