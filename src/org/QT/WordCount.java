package org.QT;
import java.util.*;

public class WordCount {
	
    public static void main(String[] args) {
    	

    	        String input = "welcome to java world welcome to java";

    	        String[] words = input.toLowerCase().trim().split(" ");

    	        // Map to store word count & in order
    	        Map<String, Integer> wordMap = new LinkedHashMap<>();

//    	        for (String word : words) {
//    	            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
//    	        }
    	        
    	        for (String word : words) {
    	            if (wordMap.containsKey(word)) {
    	                wordMap.put(word, wordMap.get(word) + 1);
    	            } else {
    	                wordMap.put(word, 1);
    	            }
    	        }
    	        

    	        // Print result word=frequency
    	        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
    	            System.out.println(entry.getKey() + " = " + entry.getValue());
    	        }
    	    }
    	}

	


