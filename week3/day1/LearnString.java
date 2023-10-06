package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Sathish kumar";
		
		int count = 0;
		char match = 's';
		char[] nameArray = name.toCharArray();

		for (int i = 0; i <= nameArray.length - 1; i++) {

			if (nameArray[i] == match) {
				count++;

			}

		}
		System.out.println(count);
	}

}
