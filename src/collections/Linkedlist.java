package collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();
		names.add("Anoop singh");
		names.add("Anoop Sharma");
		names.add("Bablu dubey");
		names.add("Elop chand");
		names.add("vivek srivastava");
		System.out.println(names);
		names.addFirst("add first");
		System.out.println(names);
		names.addLast("add last");
		System.out.println(names);
		boolean b = names.contains("vivek srivastava");
		System.out.println(b);
		boolean b1 = names.contains("asfaf srivastava");
		System.out.println(b1);
		System.out.println(names.element());
		System.out.println(names);
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		System.out.println(names.indexOf("Anoop singh"));
		names.offer("offer");
		System.out.println(names);

	}

}
