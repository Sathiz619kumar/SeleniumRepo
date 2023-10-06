package week3.day2.assignments.listSet;

public class findTheMissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,8};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=(i+1)) {
				
				System.out.println("Missing integer is "+(i+1));
				break;
			}
			
		}
	}

}
