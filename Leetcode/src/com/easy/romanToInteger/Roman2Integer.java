package com.easy.romanToInteger;

public class Roman2Integer {
	 public int romanToInt(String s) {
	        int counter = 0;
	        int result = 0;
	        
	        for(int i = s.length()-1 ; i>=0;i--){
	            if(s.charAt(i)=='M'){
	                if(i==0){
	                    result += 1000;
	                }else if(s.charAt(i-1)=='C'){
	                    result += 900;
	                    i--;
	                }else{
	                    result += 1000;
	                }
	            }
	            
	            if(s.charAt(i)=='D'){
	                if(i==0){
	                    result += 500;
	                }else if(s.charAt(i-1)=='C'){
	                    result += 400;
	                    i--;
	                }else{
	                    result += 500;
	                }
	            }
	            
	            
	            if(s.charAt(i)=='C'){
	                if(i==0){
	                    result += 100;
	                }else if(s.charAt(i-1)=='X'){
	                    result += 90;
	                    i--;
	                }else{
	                    result += 100;
	                }
	            }
	            
	            if(s.charAt(i)=='L'){
	                if(i==0){
	                    result += 50;
	                }else if(s.charAt(i-1)=='X'){
	                    result += 40;
	                    i--;
	                }else{
	                    result += 50;
	                }
	            }
	            
	             if(s.charAt(i)=='X'){
	                if(i==0){
	                    result += 10;
	                }else if(s.charAt(i-1)=='I'){
	                    result += 9;
	                    i--;
	                }else{
	                    result += 10;
	                }
	            }
	            
	            if(s.charAt(i)=='V'){
	                if(i==0){
	                    result += 5;
	                }else if(s.charAt(i-1)=='I'){
	                    result += 4;
	                    i--;
	                }else{
	                    result += 5;
	                }
	            }
	            
	            if(s.charAt(i)=='I') {
	            	for(int j = i-1;j>=0;j--) {
	            		if(s.charAt(j)=='I') {
	            			
	            		}else {
	            			
	            		}
	            	}
	            }
	            
	        }
			return result;
	        
	    }
}
