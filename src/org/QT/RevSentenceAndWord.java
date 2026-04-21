package org.QT;

public class RevSentenceAndWord {

	public static void main(String[] args) {
		String str = "Welcome to Blore"; 
    	
		String[] words=str.split(" "); 
		
		for(int i=words.length-1; i>=0; i--)
		{
			String word=words[i]; 
			String revWord = ""; 
			for(int j=word.length()-1; j>=0; j--)
			{
				char c=word.charAt(j); 
				revWord=revWord+c; 
				
			}
			System.out.print(revWord+" ");
		}

	

	}

}
