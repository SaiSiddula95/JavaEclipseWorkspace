package easy.findAllNumbersDisappeared;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappeared {
	 
	public static void main(String[] args) {
		int[] input = {1,2,3};
		List<Integer> output = findDisappearedNumbers(input);
		System.out.println(output.toString());
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> res = new ArrayList<Integer>();
	        int n = nums.length;
	        
	        
	        for(int i =0;i<nums.length;i++) {
	        	if(nums[i]%(i+1)==0) {
	        		System.out.println(i);
	        	}
	        }
	        System.out.println(res.toString());
	       
	        
	        
	        
	        return res;
	}
}
