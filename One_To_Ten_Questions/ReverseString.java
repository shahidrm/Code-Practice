package One_To_Ten_Questions;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string to reverse: ");
        String originalString = sc.nextLine();

        // Using StringBuilder to reverse the string
        StringBuilder reversString = new StringBuilder(originalString);
        reversString.reverse();

        System.out.println("Reversed string: " + reversString);
	}
}