package org.String;

import java.util.*;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
    	String str = "ekanthalingam"; 
    	String res = ""; 
    	Set<Character> set = new LinkedHashSet<>();
    	
    	for(char c:str.toCharArray())
    	{
    		set.add(c); 
    	}
    	for(char c:set)
    	{
    		res = res+c; 
    	}
    	
    	System.out.println(res);


        }

}
