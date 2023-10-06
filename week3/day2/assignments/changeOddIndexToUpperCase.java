package week3.day2.assignments;

public class changeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		char[] charArray = test.toCharArray();

		for (int i = 0; i <= charArray.length - 1; i++) {
			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}

		}
		System.out.println(charArray);
	}

}
