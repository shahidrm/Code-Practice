package Twenty_To_Thirty_Questions;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {

//		24. Write a Java program to perform a linear search on an array.
		
		int n,count=0;
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter search Elements");
		n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		if(count>0)
			System.out.println("Item Found "+count+" times");
		else
			System.out.println("Item not Found");

	}
}
