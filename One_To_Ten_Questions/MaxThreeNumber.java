package One_To_Ten_Questions;

import java.util.Scanner;

public class MaxThreeNumber {
	
//	4. Write a Java program to find maximum of three numbers
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the Secound Number : ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the third Number : ");
		double num3 = sc.nextDouble();
		
//		double fma = Math.fma(num1, num2, num3);
		
		// Find the maximum number
        double max = num1;

        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Number of " + num1 + ", " + num2 + " and " + num3);
        System.out.println("Maximum is: " + max);

        sc.close();
	}

}
