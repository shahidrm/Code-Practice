package One_To_Ten_Questions;
import java.util.*;

public class PalindromeString {

//	public static void main(String[] args) {

//		public static boolean isPalindrome(String str) {
//		    int n = str.length();
//
//		    // Compare characters from beginning and end
//		    for (int i = 0; i < n/2; i++)
//		        if (str.charAt(i) != str.charAt(n-i-1))
//		            return false;
//
//		    return true;
//		}
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string to check if it is a palindrome: ");
	        String originalString = scanner.nextLine();

	        // Convert the string to lowercase (optional, to ignore case sensitivity)
	        String lowercaseString = originalString.toLowerCase();

	        // Check if the string is a palindrome
	        if (isPalindrome(lowercaseString)) {
	            System.out.println("'" + originalString + "' is a palindrome.");
	        } else {
	            System.out.println("'" + originalString + "' is not a palindrome.");
	        }
	}
// create method to check palindrome.
private static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; // Characters do not match, not a palindrome
	            }
	            left++;
	            right--;
	        }
	        return true; // All characters matched, palindrome
	    }
}
