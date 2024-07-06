package Twenty_To_Thirty_Questions;

public class MaxMinArray {

	public static void main(String[] args) {

//		22. Write a Java program to find the maximum and minimum elements in an array.

		int[] array = {100, 40, 70, 11, 50, 90};

        int max = array[0];
        int min = array[0];

        // Find maximum and minimum elements in the array
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
	}
}
