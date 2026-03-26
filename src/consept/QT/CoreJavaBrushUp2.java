package consept.QT;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int myNum = 5; 
		String website = "Rahul Shetty"; 
		char c = 'r'; 
		double dec = 10.5; 
		boolean myCard = true; 
		System.out.println("The number: "+myNum);
		
		//Arrays
		int[] arr = new int[5];
		arr[0]=1; 
		arr[1]=5; 
		arr[2]=10; 
		arr[3]=50; 
		arr[4]=100; 
		
		int[] arr2 = { 1, 2, 3, 4, 5 }; 
		System.out.println("arr2 Value is "+arr2[2]);
		
		//for loop 
		System.out.println("array1");
		for (int i=0; i<arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
			
		}
		
		//for loop 
		System.out.println();

		System.out.println("array2");

		for (int i=0; i<arr2.length; i++) 
		{
			System.out.print(arr2[i]+" ");
			
		}
		
		String[] name = {"ekanth", "Shine", "Adona"};
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("==enhanced for loop==");
		for(String n:name)
		{
			System.out.println(n);
		}
	
		
		
		
		

	}

}
