package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> rollNumber = new ArrayList<Integer>();
		rollNumber.add(11);
		rollNumber.add(22);
		rollNumber.add(33);
		rollNumber.add(55);
		rollNumber.add(28);
		System.out.println(rollNumber);
		System.out.println(rollNumber.get(3));
		System.out.println(rollNumber.indexOf(22));
		//=======================================================================
		System.out.println("--------------------------");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.add(1, 77);
		System.out.println(list);
		list.addAll(rollNumber);
		System.out.println(list);
		System.out.println(list.contains(1));
		//=======================================================================
		System.out.println("--------------------------");
	
		
	}

}
