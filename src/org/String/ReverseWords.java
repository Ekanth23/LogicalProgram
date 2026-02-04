package org.String;

public class ReverseWords {
	
	public static void main(String[] args) {
        String input = "Jaya Ranjini";
        System.out.println(reverseEachWord(input));
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }

}
