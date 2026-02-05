package org.QT;
import java.util.*;

public class SortAnArray {
	
    public static void main(String[] args) {
    	
    	
    	
        int[] arr = { 40, 10, 50, 30, 20 }; 
        int n=arr.length; 
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Code from Ekanth_LogicalProgam branch");
        System.out.println("Code from Main Branch");
        System.out.println("sorted Array");
        
        for(int num:arr){
            System.out.print(num+" ");
        } 
    	
        
       }
	
	

}
