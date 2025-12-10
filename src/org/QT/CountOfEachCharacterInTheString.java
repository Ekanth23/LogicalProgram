package org.QT;
import java.util.*;

public class CountOfEachCharacterInTheString {
	
    public static void main(String[] args) {
        String str = "hello world";

        // Remove spaces
        str = str.replaceAll("\\s", "");

        // Create a HashMap to store character counts
        Map<Character, Integer> map = new HashMap <>();

        // Loop through each character
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Print the result
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
	
	

}
