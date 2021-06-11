import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		
		/*Two Strings are called the anagram if they contain the same characters. 
		 * However, the order or sequence of the characters can be different.*/
		
		String s1 ="Brag";
		String s2 ="Grab";
		checkAnagram(s1,s2);
	}
	public static void checkAnagram(String str1, String str2)
	{
		if(str1.toLowerCase().equals(str2.toLowerCase()))
		{
			System.out.println("Strings are not anagram");
		}
		else
		{
			char chr1[]= str1.toLowerCase().toCharArray();
			char chr2[]= str2.toLowerCase().toCharArray();
			ArrayList<Character> list1 = new ArrayList<>();
			ArrayList<Character> list2 = new ArrayList<>();
			for(int i=0;i<chr1.length;i++)
			{
				list1.add(chr1[i]);
			}
			for(int i=0;i<chr2.length;i++)
			{
				list2.add(chr2[i]);
			}		
			Collections.sort(list1);
			Collections.sort(list2);
			
			System.out.println(list1);	
			System.out.println(list2);
			
			if(list1.containsAll(list2))
			{
				System.out.println("Both strings are anagram");
			}
		}
	}

}
