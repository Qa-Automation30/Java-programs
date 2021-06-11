package april23_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,4,5,6,7,8,9,10));
		HashSet<Integer> newList = new HashSet<>(list);
		ArrayList<Integer> saf = new ArrayList<>();
		for (Integer integer : newList) {
			saf.add(integer);
		}
		System.out.println(saf);
		
		
		
		int []  arr= {1,2,3,4,5,6,2,3,4,5,6,7,8,9};
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i =0;i<arr.length;i++)
		{
			if(!list1.contains(arr[i]))
			{
				list1.add(arr[i]);
			}
		}
		 Object[] obj =list1.toArray();
		 System.out.println("=======================");
		 System.out.println(Arrays.toString(obj));
		 
		 
		List<Integer> lis11 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(lis11);
	}

}
