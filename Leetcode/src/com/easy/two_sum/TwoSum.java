package com.easy.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
	        int[] res = new int[2];
	        for(int i=0;i<nums.length-1;i++){
	            int search = target - nums[i];
	            for(int j=i+1; j<=nums.length-1;j++){
	                if(search==nums[j]){
	                    res[0]= i;
	                    res[1]= j;
	                    break;
	                }
	            }
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	    	int[] input = {3,2,4};
	    	
	    	
	    	
	    	int[] hello = twoSum3(input,6);
	    	
			System.out.println(Arrays.toString(hello));
		}
	    
	    
	    public static int[] twoSum2(int[] nums, int target) {
	        int[] res = new int[2];
	        for(int i=0;i<nums.length-1;i++){
	            int search = target - nums[i];
	            for(int j=i+1; j<=nums.length-1;j++){
	                if(search==nums[j]){
	                    res[0]= i;
	                    res[1]= j;
	                    break;
	                }
	            }
	        }
	        return res;
	    }
	    
	    
	    public static int[] twoSum3(int[] nums, int target) {
	        int[] res = new int[2];
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i = 0; i<=nums.length-1;i++) {
	        	int search = target-nums[i];
	        	if(map.containsKey(target-nums[i])) {	        		
	        		res[0] = map.get(target-nums[i]);
	        		res[1] = i;
	        		break;
	        	}else {
	        		map.put(nums[i], i);
	        	}        	
	        }	        
	        return res;
	    }
}
