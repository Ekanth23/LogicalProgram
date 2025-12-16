package org.MultiProgram;

import java.util.*;

public class DuplicatePrograms {

    public static void main(String[] args) {

        duplicateNumber();
        duplicateString();
        duplicateCharacters();
        duplicateWords();
        duplicateInArray();
        duplicateUsingSet();
        duplicateCountUsingMap();
    }

    // 1️⃣ Find Duplicate Numbers in an Integer
    static void duplicateNumber() {
        int num = 122345;
        Set<Character> set = new HashSet<>();

        System.out.print("Duplicate digits: ");
        for (char c : String.valueOf(num).toCharArray()) {
            if (!set.add(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    // 2️⃣ Find Duplicate Strings in a String Array
    static void duplicateString() {
        String[] arr = {"Java", "API", "Java", "Selenium", "API"};
        Set<String> set = new HashSet<>();

        System.out.print("Duplicate Strings: ");
        for (String s : arr) {
            if (!set.add(s)) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    // 3️⃣ Find Duplicate Characters in a String
    static void duplicateCharacters() {
        String str = "programming";
        Set<Character> set = new HashSet<>();

        System.out.print("Duplicate Characters: ");
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    // 4️⃣ Find Duplicate Words in a Sentence
    static void duplicateWords() {
        String str = "java makes java learning easy and learning fun";
        String[] words = str.split(" ");
        Set<String> set = new HashSet<>();

        System.out.print("Duplicate Words: ");
        for (String w : words) {
            if (!set.add(w)) {
                System.out.print(w + " ");
            }
        }
        System.out.println();
    }

    // 5️⃣ Find Duplicate Elements in an Integer Array
    static void duplicateInArray() {
        int[] arr = {1, 2, 3, 2, 4, 5, 3};
        Set<Integer> set = new HashSet<>();

        System.out.print("Duplicate Numbers in Array: ");
        for (int n : arr) {
            if (!set.add(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    // 6️⃣ Remove Duplicates using Set
    static void duplicateUsingSet() {
        int[] arr = {1, 2, 2, 3, 4, 4};

        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr) {
            set.add(n);
        }

        System.out.println("After removing duplicates: " + set);
    }

    // 7️⃣ Count Duplicates using Map
    static void duplicateCountUsingMap() {
        String str = "practice makes practice perfect";
        String[] words = str.split(" ");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        System.out.println("Duplicate Count using Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}

