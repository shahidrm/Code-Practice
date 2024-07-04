package Eleven_To_Twenty_Questions;

import java.util.Scanner;

public class ConsonentNumber {
	
//	18. Write a Java program to count the number of consonent in a given string.

	public static void main(String[] args) {

		int i,vowel,cons;
		vowel = 0;
		cons=0;
		String a = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		a = sc.nextLine();
		
		for(i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch!=' ')
			{
				if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
					vowel++;
				else
					cons++;
			}
		}
		System.out.println("Total Vowel= "+vowel+"\nTotal Consonants= "+cons);
	}

}
