package JavaProgrammingQuestions;

import java.util.ArrayList;

public class PrintingUniqueNumber {

	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 5, 8, 9, 5, 6, 7, 8, 9, 10, 8, 4, 6, 7 };
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
				count++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				System.out.println(arr[i] + "-->" + count);
			}
		}
	}
}
