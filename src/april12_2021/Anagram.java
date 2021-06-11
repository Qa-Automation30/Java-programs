package april12_2021;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		
		/*Two Strings are called the anagram if they contain the same characters. 
		 * However, the order or sequence of the characters can be different.*/
		
		String s1 ="BhJk";
		String s2 ="jHbK";
		checkAnagarm(s1,s2);
	}
	public static void checkAnagarm(String s1, String s2)
	{
		if(!(s1.length()==s2.length()))
		{
			System.out.println("String's length does not match");
		}
		else if(s1.length()==0 || s2.length()==0)
		{
			System.out.println("Please enter a valid string");
		}
		else
		{
		char ch1[] = s1.toLowerCase().toCharArray();
		char ch2[] =s2.toLowerCase().toCharArray();
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		for(int i=0;i<ch1.length;i++)
		{
			list1.add(ch1[i]);
		}
		for(int i=0;i<ch2.length;i++)
		{
			list2.add(ch2[i]);
		}
		Collections.sort(list1);
		Collections.sort(list2);
		if(list1.containsAll(list2))
		{
			System.out.println("Both strings are anagram");
		}
		else
		{
			System.out.println("Both strings are not anagram");
		}
		
	}

}
}
