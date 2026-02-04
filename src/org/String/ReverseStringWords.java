package org.String;

public class ReverseStringWords {

    public static void main(String[] args) {

        String input = "Java956bdd7092selenium67a";
        String output = reverseWords(input);
        //expected result = "avaJ956ddb7092muineles67a"

        System.out.println(output);
    }

    public static String reverseWords(String input) {

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is a letter, collect it
            // if (Character.isAlphebetic(ch)) 
            if (Character.isLetter(ch)) {
                temp.append(ch);
            } 
            // If digit comes, reverse collected letters and append
            else {
                result.append(temp.reverse());
                temp.setLength(0);     // clear temp
                result.append(ch);    // add number
            }
        }

        // Reverse last collected word
        result.append(temp.reverse());

        return result.toString();
    }
}
