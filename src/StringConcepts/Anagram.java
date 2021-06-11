package StringConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
	public static ArrayList<Integer>arr;
	public static int b;
	public static void main(String[] args) {
		arr = new ArrayList<Integer>();
		String str1="Brag";
		String str2="Grab";
		arr =checkAnagram(str1,str2);
		Collections.sort(arr);
		for (Integer num : arr) {
			char c = (char)num.intValue();
			System.out.println(num+"-->"+c);
		}
	}
	public static ArrayList<Integer> checkAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			System.out.println("Length of string is not same");
			System.exit(0);
		}
		char chr1[] = s1.toLowerCase().toCharArray();
		char chr2[] =s2.toLowerCase().toCharArray();
		for(int i=0;i<chr1.length;i++)
		{
			b =chr1[i];
			arr.add(b);
		}
		return arr;
	}

}
