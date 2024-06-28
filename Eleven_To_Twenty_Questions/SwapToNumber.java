package Eleven_To_Twenty_Questions;

import java.util.Scanner;

public class SwapToNumber {

	public static void main(String[] args) {

		int a,b,temp;
		System.out.println("Enter two Numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping "+ a+" "+b);
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping "+ a+" "+b);
	}

}
