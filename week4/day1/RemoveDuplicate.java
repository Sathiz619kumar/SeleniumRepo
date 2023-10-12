package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
String companyName = "google";
char[] charArray = companyName.toCharArray();
Set<Character> ch = new HashSet<Character>();
Set<Character> ch1 = new TreeSet<Character>();
Set<Character> ch2 = new LinkedHashSet<Character>();

for (int i = 0; i < charArray.length; i++) {
	ch.add(charArray[i]);
	ch1.add(charArray[i]);
	ch2.add(charArray[i]);
}
System.out.println(ch);
System.out.println(ch1);
System.out.println(ch2);

for(Character s1:ch) {
	System.out.print(" "+s1);
}
for(Character s2:ch1) {
	System.out.print(" "+s2);
}
for(Character s3:ch2) {
	System.out.print(" "+s3);
}
	
	
	
}
	}


