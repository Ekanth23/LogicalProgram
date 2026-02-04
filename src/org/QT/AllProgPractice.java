package org.QT;
import java.util.*;

public class AllProgPractice {
	
	public static void main(String[] args) {
		
		int[] arr = { 10, 30, 50, 20, 40, 60, 70, 80 }; 
		
		int largest = Integer.MIN_VALUE; 
		int secondLargest = Integer.MIN_VALUE; 
		
		for (int num:arr) {
			if(num>largest) {
				secondLargest = largest; 
				largest = num; 
			} else if(num>secondLargest && num != largest) {
				secondLargest = num; 
			}
		}  if( secondLargest == Integer.MIN_VALUE) {
		
		System.out.println("there is no such second Largest");
		
	} else {
		System.out.println("Second Largest: "+secondLargest);
	}

}
}
