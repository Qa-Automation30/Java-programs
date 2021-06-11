package april23_2021;

import java.util.ArrayList;
import java.util.Collections;

public class compareStrings {

	public static void main(String[] args) {
		String s1 = "Need to compare strings";
		String s2 = "strings Need to compars";
		
		String newStr1[] = s1.toLowerCase().split(" ");
		String newStr2[] = s2.toLowerCase().split(" ");
		
		ArrayList<String> list1 = new ArrayList<>();
		for(int i=0;i<newStr1.length;i++)
		{
			list1.add(newStr1[i]);
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		for(int i=0;i<newStr2.length;i++)
		{
			list2.add(newStr2[i]);
		}
		
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1);
		System.out.println(list2);
		if(list1.containsAll(list2))
		{
			System.out.println("Both the string are same");
		}
		else
		{
			System.out.println("both the strings not same");
		}
		

	}

}
