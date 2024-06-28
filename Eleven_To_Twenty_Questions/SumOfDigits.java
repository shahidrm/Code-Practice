package Eleven_To_Twenty_Questions;

import java.util.Scanner;

public class SumOfDigits {
	
//	12. Write a Java program to find the sum of the digits of a given number.

	public static void main(String[] args) {

		int n,r,sum=0;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while(n>0)
		{
			r = n%10;
			sum = sum+r;
			n = n/10;
		}
		System.out.println("Sum Of Digits "+ sum);
		
		}
	}


