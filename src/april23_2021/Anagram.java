package april23_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		/*Two Strings are called the anagram if they contain the same characters. 
		 * However, the order or sequence of the characters can be different.*/
		
		String s1 ="Brag";
		String s2 ="Grab";
		
		String newStr1= s1.toLowerCase();
		String newStr2= s2.toLowerCase();
		
		ArrayList<Character> list1 = new ArrayList<>();
		for(int i=0;i<newStr1.length() ;i++)
		{
			list1.add(newStr1.charAt(i));
		}
		ArrayList<Character> list2 = new ArrayList<>();
		for(int i=0;i<newStr2.length();i++)
		{
			list2.add(newStr2.charAt(i));
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1);
		System.out.println(list2);
		if(list1.containsAll(list2))
		{
			System.out.println("Anagarm");
		}
		


	}

}
	