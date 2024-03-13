import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        char[] current = s.toCharArray();
        Map<Character,Integer> existingMap = new HashMap<Character,Integer>();        
        
        for(int i = 0; i<current.length;i++){
            char tempChar = current[i];
            existingMap.put(tempChar,existingMap.getOrDefault(tempChar,0)+1);
            if(existingMap.get(tempChar)>1){
                return longestSubstring;
            }else{
                longestSubstring++;
            }            
        }        
        return longestSubstring;                
    }
}