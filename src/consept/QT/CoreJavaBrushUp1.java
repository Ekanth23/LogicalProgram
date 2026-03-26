package consept.QT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		

		
		int[] arr2 = { 1, 2, 3, 4, 5, 33, 55, 66 }; 
		
		
		
		//check if array has multiple of 2
		for(int i=0; i<arr2.length; i++) 
		{
			if(arr2[i] % 2 ==0 ) 
			{
				System.out.println(arr2[i]);
				break;
			} else 
			{
				System.out.println(arr2[i]+ " is not multiple of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("java"); 
		a.add("C#"); 
		a.add("SQL"); 
		a.add("Selenium"); 
		a.add("playwright");
		a.remove(2); 
		a.get(3); 
		System.out.println(a.get(3));
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("===enhanced forloop===");
		for(String s:a)
		{
			System.out.println(s);
		}
		
		System.out.println(a.contains("playwright"));
		
		String[] name = {"ekanth", "Shine", "Adona"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("ekanth"));

		
		

	
		
		
		
		

	}

}
