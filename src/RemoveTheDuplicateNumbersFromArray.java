import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveTheDuplicateNumbersFromArray {

	public static void main(String[] args) {
		   
		int [] arr = {1,2,3,4,5,9,8,7,6,5,4,3,1,2,4,5,6};
		
		// RemoveTheDuplicateNumbersFromArray
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!list.contains(arr[i]))
			{
				list.add(arr[i]);
			}
		}
		System.out.println(list);
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);
	}
	
	

}
