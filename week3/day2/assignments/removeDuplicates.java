package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class removeDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		Set<Character> ch=new TreeSet<Character>();
		for(int i=0;i<text.length();i++) {
			ch.add(text.charAt(i));
		}
		
		System.out.println(ch.toString());
		for(Character a : ch) {
			System.out.print(a.toString());
			
		}

}
}
