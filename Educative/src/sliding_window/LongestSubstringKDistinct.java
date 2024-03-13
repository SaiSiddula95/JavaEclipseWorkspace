package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
	
	public static void main(String[] args) {
		String s = "araaci";
		int result = findLength(s,2);
		System.out.println("REsult: "+ result);
		Map<Character,Integer> map = new HashMap<Character,Integer>(10);
	}
	
	
	public static int findLength(String str, int k) {
		if (str == null || str.length() == 0)
		      throw new IllegalArgumentException();
		
		int longestLength = 0;
		int leftWindow = 0;
		String s = "";
		
		
		
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for(int windowEnd =0; windowEnd<str.length();windowEnd++) {		
			char rightChar = str.charAt(windowEnd);
			hashMap.put(rightChar,hashMap.getOrDefault(rightChar,0)+1);	
			while(hashMap.size()>k) {
				char leftChar = str.charAt(leftWindow);
				hashMap.put(leftChar, hashMap.get(leftChar)-1);
				if(hashMap.get(leftChar)==0) {
					hashMap.remove(leftChar);
				}
				leftWindow++;
			}
			longestLength = Math.max(longestLength, windowEnd-leftWindow+1);
			
		}
		return longestLength;
	}
}
