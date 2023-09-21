package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };
		int length = data.length;
		System.out.println("The length of the array is " + length);
		Arrays.sort(data);

		for (int i = 0; i <= length - 1; i++) {
			System.out.println(data[i]);
		}

		System.out.println(data[length - 2]);
	}

}
