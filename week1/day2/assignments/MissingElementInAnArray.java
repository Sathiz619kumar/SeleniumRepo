package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Sort the array

		// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Arrays.sort(arr);
		int length = arr.length;
		int length1 = arr1.length;
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i <= length1 - 1; i++) {

			sum1 = sum1 + arr1[i];

		}
		for (int j = 0; j <= length - 1; j++) {

			sum = sum + arr[j];

		}

		System.out.println(sum1 - sum);

	}

}
