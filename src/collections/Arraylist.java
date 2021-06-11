package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static ArrayList<Integer> obj;
	public static void main(String[] args) {
		obj = new ArrayList<Integer>();
		System.out.println(obj.size());
		obj = addIntegerValues(20);
		System.out.println(obj.size());
		System.out.println(obj);
		System.out.println(obj.get(0));
		System.out.println(obj.get(1));
		System.out.println(obj.get(2));
		System.out.println("\n");
		for(int i =0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("\n");
		for (Integer value : obj) {
			System.out.println(value);
		}
		System.out.println("--------------");
		obj.stream().forEach(values->System.out.println(values));
		System.out.println("=======================");
		Iterator<Integer> itr= obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static ArrayList<Integer> addIntegerValues(int num)
	{
		for(int i=0;i<num;i++)
		{
			i++;
			obj.add(i);
		}
		return obj;
	}
}
