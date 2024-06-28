package Eleven_To_Twenty_Questions;

import java.util.Scanner;

public class SwapWithoutVariable {

	public static void main(String[] args) {

		int a,b;
		System.out.println("Enter two Numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping "+ a+" "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping "+ a+" "+b);
	}

}
