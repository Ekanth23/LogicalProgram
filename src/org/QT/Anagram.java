package org.QT;
import java.util.*;

public class Anagram {
	
    static boolean checkAnagram(String s1, String s2){
        //check the length is equal 
        if(s1.length() != s2.length()){
            return false;
        }
        //sort 
        char[] s1Array = s1.toCharArray(); 
        char[] s2Array = s2.toCharArray();
        
        Arrays.sort(s1Array); 
        Arrays.sort(s2Array); 
        
        return Arrays.equals(s1Array, s2Array); 
    }
	
    public static void main(String[] args) {
    	
        String s1="earth"; 
        String s2="heart"; 
        if(checkAnagram(s1, s2)){
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        
    }
}
