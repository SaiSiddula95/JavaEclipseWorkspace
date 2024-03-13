package com.easy.longestcommonprefix;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        Map<String,Integer> map = new HashMap<String,Integer>();        

        for(int i=0;i<strs[0].length();i++) {
        	map.put(strs[0][i], i);
        	
        }
        
        
        for(int i = 0; i<strs.length-1;i++) {
        	
        }
        
        
        return result;
    }
}
