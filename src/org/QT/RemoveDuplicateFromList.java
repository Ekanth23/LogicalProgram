  package org.QT;
import java.util.*;
public class RemoveDuplicateFromList {
	
    	
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(2, 5, 2, 8, 5, 6, 8, 8);

            List<Integer> unique = new ArrayList<>();

            for (Integer num : list) {
                if (!unique.contains(num)) {
                    unique.add(num);
                }
            }

            System.out.println("After removing duplicates: " + unique);
//            
//            List<String> list = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Grapes");
//
//            List<String> unique = new ArrayList<>();
//
//            for (String str : list) {
//                if (!unique.contains(str)) {
//                    unique.add(str);
//                }
//            }
//
//            System.out.println("After removing duplicates: " + unique);
     }
}
