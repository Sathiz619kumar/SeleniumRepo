package week3.day2.assignments.listSet;

import java.util.ArrayList;
import java.util.List;

public class findIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		 * 
		 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
		 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
		 * a nested for another array from 0 to array length e) Compare Both the arrays
		 * using a condition statement
		 * 
		 * f) Print the first array (shoud match item in both arrays)
		 */

		/*
		 * int a[]= {3,2,11,4,6,7}; int b[]={1,2,8,4,9,7};
		 * 
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j < b.length; j++) {
		 * 
		 * if(a[i]==b[j]) { System.out.println(a[i]); break; }
		 * 
		 * }
		 */

		List<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);

		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(4);
		b.add(9);
		b.add(7);

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if (a.get(i) == b.get(j)) {
					System.out.println(a.get(i));

				}

			}

		}

	}

}
