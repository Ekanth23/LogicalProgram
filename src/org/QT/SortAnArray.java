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

<<<<<<< HEAD
        System.out.println("main branch code updated everywhere"); 
        System.out.println("code from Ekanth branch"); 
        System.out.println("code checking"); 

=======
        System.out.println("main branch code updated everywhere");
        System.out.println("from practice branch");
>>>>>>> practice

        for(int num:arr){
            System.out.print(num+" ");
        } 
    	
        
       }
	
	

}
