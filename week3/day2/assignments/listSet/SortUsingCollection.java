package week3.day2.assignments.listSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {

		String company[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		int length1 = company.length;
		List<String> ch = new ArrayList<String>();

		for (int i = length1 - 1; i >= 0; i--) {
			System.out.println(company[i]);
			ch.add(company[i]);

		}
		System.out.println(ch);
		Collections.sort(ch);
		System.out.println(ch);
	}

}
