package org.QT;

public class ReverseANumber {
	public class ReverseNumber {
	    public static void main(String[] args) {
	        int num = 12345;
	        int rev = 0;

	        while (num != 0) {
	            int digit = num % 10;    // get last digit
	            rev = rev * 10 + digit;  // append digit to reverse
	            num = num / 10;          // remove last digit
	        }

	        System.out.println("Reversed Number: " + rev);
	    }
	}


}
