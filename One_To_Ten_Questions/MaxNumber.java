package One_To_Ten_Questions;
import java.util.Scanner;

public class MaxNumber {

//	3.Write a Java program to calculate the sum of two numbers.
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	     System.out.print("Enter the first number: ");
	     double number1 = sc.nextDouble();

	     System.out.print("Enter the second number: ");
	     double number2 = sc.nextDouble();

	     double max = Math.max(number1, number2);

	     System.out.println("Number of " + number1 + " and " + number2 + " Maximum is: " + max);

	      sc.close();
	    }
	}
