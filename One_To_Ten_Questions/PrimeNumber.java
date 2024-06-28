package One_To_Ten_Questions;
import java.util.Scanner;

public class PrimeNumber {
	
	//10. Write a Java program to check if a number is a prime number.

	public static void main(String[] args) {

		int n,count=0;
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}
