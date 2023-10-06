package week3.day2.assignments.listSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class printDuplicateVariables {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length1 = arr.length;
		/*
		 * System.out.println(length1); int count = 0; for (int i = 0; i < length1-1;
		 * i++) { for (int j = 1; j < length1-1; j++) {
		 * 
		 * if(arr[i]==arr[j]) { count++; }
		 * 
		 * if(count>=1) { System.out.println(arr[i]); break; }
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
		List<Integer> in = new ArrayList<Integer>();
		in.add(14);
		in.add(12);
		in.add(13);
		in.add(11);
		in.add(15);
		in.add(14);
		in.add(18);
		in.add(16);
		in.add(17);
		in.add(19);
		in.add(18);
		in.add(17);
		in.add(20);
		Collections.sort(in);
		System.out.println(in);
		Set<Integer> in1 = new TreeSet<Integer>();
		for(Integer a: in) {
			if (in1.add(a)==false) {
				System.out.println(a);
			}
		}
	}

}
