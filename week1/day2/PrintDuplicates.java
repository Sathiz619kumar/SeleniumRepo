package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {

		int a[] = { 2, 5, 7, 7, 5, 9, 2, 3 };
		Arrays.sort(a);

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] == a[i + 1]) {
				System.out.println(a[i]);
			}

		}

	}

}
