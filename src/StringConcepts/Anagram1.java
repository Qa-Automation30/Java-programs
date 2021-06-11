package StringConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram1 {

	public static void main(String[] args) {
		/*
		 * Two Strings are called the anagram if they contain the same characters.
		 *  However, the order or sequence of the characters can be different.
		 * */
		
		String s1 = "Brag"; String s2= "Grab";
		String str1= s1.toLowerCase();
		String str2= s2.toLowerCase();
		checkAnagram(str1,str2);
		checkAnagram(str1,str2,1);
	}
	public static void checkAnagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the strings are not anagram");
		}
		else
		{
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();
			ArrayList<Character> c1 = new ArrayList<>();
			ArrayList<Character> c2 = new ArrayList<>();
			for(int i=0;i<char1.length;i++)
			{
				c1.add(char1[i]);
			}
			for(int i=0;i<char2.length;i++)
			{
				c2.add(char2[i]);
			}
			Collections.sort(c1);
			Collections.sort(c2);
			if(c1.equals(c2)) {System.out.println("Both the strings are anagram");}
			else {System.out.println("Both the strings are not anagram");}
		
		}
	}
	public static void checkAnagram(String str1,String str2,int num)
	{
		char chr1[] = str1.toCharArray();
		char chr2[] = str2.toCharArray();
		
		
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		if(Arrays.equals(chr1, chr2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
