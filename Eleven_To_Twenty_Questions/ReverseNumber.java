package Eleven_To_Twenty_Questions;

import java.util.Scanner;

public class ReverseNumber {
	
//	15. Write a Java program to reverse a given number.

	public static void main(String[] args) {

int n,r;
System.out.println("Enter any Number");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();

while(n>0) 
{
	r = n%10;
	
	System.out.print("Reversed Number :" +r);
	n = n/10;
}
}
		
//		 Scanner sc = new Scanner(System.in);
//	        System.out.print("Enter a number to reverse: ");
//	        int number = sc.nextInt();
//	        int reversedNumber = reverseNumber(number);
//	        System.out.println("Reversed number: " + reversedNumber);
//	        
//	    }
//
//	    public static int reverseNumber(int number) {
//	        int reversedNumber = 0;
//	        while (number != 0) {
//	            int digit = number % 10;
//	            reversedNumber = reversedNumber * 10 + digit;
//	            number /= 10;
//	        }
//	        return reversedNumber;
//	    }

}
