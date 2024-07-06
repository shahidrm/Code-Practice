package Eleven_To_Twenty_Questions;

import java.util.Scanner;

public class SumOfArray {
	
//	20. Write a Java program to sum all the elements of the array

	public static void main(String[] args) {

		int sum=0;
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements in Array");
		
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Array Elements: ");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum =a[i]+sum;
		}
		System.out.print("\nSum of Array Elements: "+sum);

		
	}

}
