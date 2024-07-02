package Twenty_To_Thirty_Questions;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

//		21. Write a Java program to reverse an array.
		
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array");
		
		for(int i=0;i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Array Elemnts: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nReverse Array Elemnts: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
