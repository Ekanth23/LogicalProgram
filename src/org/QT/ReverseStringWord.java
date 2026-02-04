package org.QT;
import java.util.*;

public class ReverseStringWord {
	
    public static void main(String[] args) {
    	

		String str = "welcome to Banglore "; 
		
		String[] words = str.split(" "); 
		
		String res="";
		
			for(int i=words.length-1; i>=0; i--) {
				
				res = res+words[i]+" ";
				
			
			
		}
		
		System.out.print(res);
       }

}
