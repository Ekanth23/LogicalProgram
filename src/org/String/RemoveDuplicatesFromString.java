package org.String;

import java.util.*;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
        String input = "hackerearth";
        System.out.println(removeDuplicates(input));
    }

    public static String removeDuplicates(String str) {

        Set<Character> set = new LinkedHashSet<>(); // keeps insertion order

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }

}
