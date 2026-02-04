package org.String;

public class UpperCaseAndLowerCase {
	
	public static void main(String[] args) {
		
		
		String s="Welcome@123", uCase="", lCase="", sp="", digit=""; 
		int uCount=0, lCount=0, dCount=0, spCount=0; 

		for(int i=0; i<s.length(); i++){

		char c=s.charAt(i);

		if(Character.isUpperCase(c)){
		uCase=uCase+c; 
		uCount++;
		} else if(Character.isLowerCase(c)){
		lCase=lCase+c;
		lCount++; 
		}else if(Character.isDigit(c)){

		digit=digit+c; 
		dCount++; 

		} else{
		sp=sp+c; 
		spCount++;
		}
		}

		System.out.println("Upper Case of the String: "+uCase); 
		System.out.println("Upper Case count: "+uCount); 

		System.out.println("Lowe Case of the String: "+lCase); 
		System.out.println("Lowe Case Count: "+lCount); 

		System.out.println("Digits of the String: "+digit); 
		System.out.println("Digits count: "+dCount); 

		System.out.println("Special character of the String: "+sp); 
		System.out.println("Special character Count: "+spCount); 
		
		
	}

}
