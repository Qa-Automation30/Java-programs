package arrayConcept;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int [] arr = {55,32,66,1,67,87,12,10};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
	}

}
