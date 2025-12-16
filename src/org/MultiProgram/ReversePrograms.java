package org.MultiProgram;

import java.util.*;

public class ReversePrograms {

    public static void main(String[] args) {

        reverseNumber();
        reverseString();
        reverseEachWord();
        reverseWordOrder();
        reverseIntArray();
        reverseStringArray();
        reverseCharArray();
        reverseUsingRecursion();
        reverseUsingCollections();
        swapWithoutTemp();
    }

    // 1️⃣ Reverse a Number
    static void reverseNumber() {
        int num = 1234, rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse Number: " + rev);
    }

    // 2️⃣ Reverse a String
    static void reverseString() {
        String s = "Java";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println("Reverse String: " + rev);
    }

    // 3️⃣ Reverse Each Word in a Sentence
    static void reverseEachWord() {
        String str = "Java is easy";
        String[] words = str.split(" ");

        System.out.print("Reverse Each Word: ");
        for (String w : words) {
            String rev = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                rev += w.charAt(i);
            }
            System.out.print(rev + " ");
        }
        System.out.println();
    }

    // 4️⃣ Reverse Word Order in a Sentence
    static void reverseWordOrder() {
        String str = "Java is easy";
        String[] words = str.split(" ");

        System.out.print("Reverse Word Order: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    // 5️⃣ Reverse Integer Array (In-place)
    static void reverseIntArray() {
        int[] arr = {1, 2, 3, 4};
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }

        System.out.print("Reverse Int Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // 6️⃣ Reverse String Array
    static void reverseStringArray() {
        String[] arr = {"Java", "Selenium", "API"};
        int start = 0, end = arr.length - 1;

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }

        System.out.print("Reverse String Array: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // 7️⃣ Reverse Character Array
    static void reverseCharArray() {
        char[] arr = {'a', 'b', 'c'};
        int i = 0, j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }

        System.out.print("Reverse Char Array: ");
        System.out.println(arr);
    }

    // 8️⃣ Reverse String using Recursion
    static void reverseUsingRecursion() {
        String s = "Hello";
        System.out.println("Reverse using Recursion: " + reverseRec(s));
    }

    static String reverseRec(String s) {
        if (s.isEmpty()) return s;
        return reverseRec(s.substring(1)) + s.charAt(0);
    }

    // 9️⃣ Reverse using Collections
    static void reverseUsingCollections() {
        Integer[] arr = {1, 2, 3};
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println("Reverse using Collections: " + list);
    }

    // 🔟 Swap without Temporary Variable
    static void swapWithoutTemp() {
        int a = 5, b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap without temp: a=" + a + ", b=" + b);
    }
}

