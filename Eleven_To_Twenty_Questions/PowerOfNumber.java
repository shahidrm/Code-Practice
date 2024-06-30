package Eleven_To_Twenty_Questions;

import java.util.Scanner;

public class PowerOfNumber {
	
//	16. Write a Java program to calculate the power of a number using a loop (eg 2pow3=8)

	public static void main(String[] args) {

		int n,p,result=1;
		System.out.println("Enter Number ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("Enter Power ");
		p = sc.nextInt();
		
		for(int i=1;i<=p;i++)
		{
			result = n*result;
		}
		System.out.println("Power of : " + result);
	}

}
