package One_To_Ten_Questions;
import java.util.Scanner;

public class SumToNumber {
	
//	2. Write a Java program to calculate the sum of two numbers.
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        // Calculate the number
        double sum = number1 + number2;

        // Display the result
        System.out.println("Sum: " + sum);

        
        sc.close();

}
}
