package collections;

import java.util.HashSet;
import java.util.Iterator;

public class setInterface {

	public static void main(String[] args) {
		
		String s = "viveksrivastava";
		char chr [] = s.toCharArray();
		HashSet<Character> newStr = new HashSet<>();
		for(int i=0;i<chr.length;i++)
		{
			newStr.add(chr[i]);
		}
		System.out.println(newStr);
		Iterator<Character> it = newStr.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		System.out.println();
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);
		numbers.add(3);
		System.out.println(numbers);
		
		
		HashSet<String> names = new HashSet<String>();
		names.add("vivek");
		names.add("anoop");
		names.add("zyus");
		System.out.println(names);
		names.add("3");
		System.out.println(names);

	}

}
