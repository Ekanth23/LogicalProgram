package org.QT;
import java.util.*;

public class SecondLargestNumber {
	
    public static void main(String[] args) {
    	
   	 int[] arr = { 50, 10, 30, 20, 40, 60 }; 
	    int largest = Integer.MIN_VALUE; 
	    int secondLargest = Integer.MIN_VALUE; 
	    for(int num:arr){
	        if(num>largest){
	            secondLargest=largest; 
	            largest=num;
	        }else if(num>secondLargest && num!=largest){
	            secondLargest=num; 
	        }
	    }
	    if(secondLargest == Integer.MIN_VALUE){
	        System.out.println("no such 2nd largest");
	    } else {
	        System.out.println("SecondLargest Number: "+secondLargest);
	    }
       }

}
