package org.Numbers;

public class Fibonacci {
	public static void main(String[] args) {

        int n = 10;
        int a = 0, b = 1, i = 2;

        System.out.print("Fibonacci: " + a + " " + b);

        while (i < n) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
            i++;
        }
    }

}
