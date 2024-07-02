package Eleven_To_Twenty_Questions;

import java.util.Scanner;

public class VowelNumbers {
	
//	17. Write a Java program to count the number of vowels in a given string.

	public static void main(String[] args) {

		char ch;
		System.out.println("Enter any character");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.print("Vowel Character");
		}
		else
		{
			System.out.print("Consonant Character");
		}
	}
	
//	String str = "Hello, how are you shahid ?";
//    int vowelCount = countVowels(str);
//    System.out.println("Number of vowels in the string: " + vowelCount);
//}
//
//// Function to count.
//public static int countVowels(String str) {
//    int count = 0;
//    // Convert the string to lowercase.
//    str = str.toLowerCase();
//    
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        // Check if the character is a vowel
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//            count++;
//        }
//    }
//    return count;
//}

}
