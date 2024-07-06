package Eleven_To_Twenty_Questions;

public class PrintArrayElements {
	
//	19. Write a Java program to print all the elements of the array.

	public static void main(String[] args) {

		 int[] array = {1, 2, 3, 4, 5};

	        System.out.println("Elements of the array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	}
}
