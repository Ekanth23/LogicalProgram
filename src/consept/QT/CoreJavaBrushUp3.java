package consept.QT;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		//String is a object 
		//it will not create new object rather points to s
		//literal String 
		
		String s1 = "Rahul Shetty"; 
		
		//with "key" everytime it creates new memory 
		String s2 = new String("Welcome");
		String s = "Rahul Shetty Academy"; 
		
		String[] words=s.split("Shetty");
		System.out.println(words[0]);
		System.out.println(words[1].trim());
		
		for(int i=s.length()-1; i>=0; i--) 
		{
			System.out.println(s.charAt(i));

		}

	}

}
