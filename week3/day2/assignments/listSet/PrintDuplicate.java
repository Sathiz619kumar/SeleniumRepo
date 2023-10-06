package week3.day2.assignments.listSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {

	public static void main(String[] args) {
		String a =  "PayPal India";
		char[] charArray = a.toCharArray();
		List<Character> ch = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			ch.add(charArray[i]);
			
		}
		Set<Character> ch1= new TreeSet<Character>();
		System.out.println(ch);
		for(Character a1: ch) {
			
			if(ch1.add(a1)==false) {
				System.out.println(a1);
				
			}
			
			
			
		}
		
	}

}
