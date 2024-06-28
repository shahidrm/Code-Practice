package One_To_Ten_Questions;
import java.util.Scanner;

public class OddEven {
	
//	5. Write a Java program to check if a number is even or odd.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

	}

}
