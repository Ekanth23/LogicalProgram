package org.QT;
import java.util.*;

public class RemoveDuplicateFromAnArray {
	
    public static void main(String[] args) {
    	
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};

        int[] unique = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean found = false;

            // Check if this element already exists in unique array
            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            // If not found → add to unique array
            if (!found) {
                unique[count] = arr[i];
                count++;
            }
        }

        // Print result
        System.out.print("After Removing Duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    	
     }
}
