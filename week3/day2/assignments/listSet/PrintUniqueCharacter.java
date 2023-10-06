package week3.day2.assignments.listSet;

import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
String name= "sathish kumar";
char[] charArrayName = name.toCharArray();
Set<Character> name1= new TreeSet<Character>();

for (int i = 0; i < charArrayName.length; i++) {
	name1.add(charArrayName[i]);
	
}
System.out.println(name1);
	}

}
