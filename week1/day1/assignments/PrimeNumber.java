package week1.day1.assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		boolean PrimeNumber = true;
		int inputValue;

		System.out.println("enter the number");

		Scanner input1 = new Scanner(System.in);
		inputValue = input1.nextInt();
		System.out.println(inputValue);

		for (int i = 2; i <= inputValue - 1; i++) {
			if (inputValue % i == 0) {
				PrimeNumber = false;

			}
		}
		if (PrimeNumber) {
			System.out.println("This is  a prime number");
		} else {
			System.out.println("This is not a prime number");
		}

	}

}
