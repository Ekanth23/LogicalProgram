package org.QT;

import java.util.*;

public class DuplicateCharacterCount {
	
	public static void main(String[] args) {
        String str = "Applee".toLowerCase(); // case-insensitive

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }        }

        // Print duplicates
        System.out.println("Duplicate characters:");
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " → " + map.get(key) + " times");
            }
        }
    }

}
