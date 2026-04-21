package org.QT;

import java.util.LinkedHashSet;
import java.util.Set;
/*
 Reverse only the character 
 	given input: Java956bdd7092selenium67a
	expec otput: avaJ956ddb7092muineles67a
 11. Second Largest Number 
 12. Sort an Array
 1.Stream
 2.Anagram
 3.count of Each Char in the String  
 4.Duplicate char count 
 5.Remove Duplicate From An Array 
 6.Remove Duplicate From List
 7.Reverse a Number
 8. Reverse a String 
 9. Reverse a word 
 10. Reverse a Sentence and Word

 13. Word Count 
 #String 
 14. Remove Duplicate from String 
 
 
 */

public class Practice {

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
