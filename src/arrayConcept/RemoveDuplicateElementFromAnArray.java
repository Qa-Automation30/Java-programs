package arrayConcept;

import java.util.ArrayList;

public class RemoveDuplicateElementFromAnArray {

	public static void main(String[] args) {
		 int arr[] = {10,20,20,30,30,40,50,50};  
		 
		 ArrayList<Integer> list = new ArrayList<>();
		 for(int i=0;i<arr.length;i++)
		 {
			 if(!list.contains(arr[i]))
			 {
				 list.add(arr[i]);
			 }
		 }
		
		 System.out.println(list);
	}

}
