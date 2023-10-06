package week3.day2.assignments.listSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
	
		
		List<Integer> a = new ArrayList<Integer>();
	for (int i = 0; i < data.length; i++) {
		a.add(data[i]);
		
	}
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		System.out.println("The 2nd largest integer is "+a.get(1));
	}

}
