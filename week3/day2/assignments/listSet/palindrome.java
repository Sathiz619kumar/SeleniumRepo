package week3.day2.assignments.listSet;

public class palindrome {

	public static void main(String[] args) {
		String text = "madam";
		int length1 = text.length();
		System.out.println(length1);
		String rev = "";
		for (int i = length1-1; i >= 0; i--) {
			rev = rev+text.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(text)) {
			System.out.println("It is a Palindrome");
		}
	}

}
