package StringConcepts;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		int [] numbers = {1,2,100,3,4,6,7,3,6,9,4,10,10,11,22,43,54,65,33,44,43};
		char [] chrArray = {'c','a','f','a','b','a'};
		String str [] = {"test","test1","test2","test22","test","test1"};
		String strr ="Release alignment";
		System.out.println(numbers.length);
		System.out.println(chrArray.length);
		removeDuplicateNumbers(numbers);
		removeDuplicateNumbers(numbers,1);
		removeDuplicateChar(chrArray);
		removeDuplicateChar(chrArray, 1);
		removeDuplicateString(str);
		removeDuplicateString(str,1);
		removeDuplicateWordFromString(strr);
	}
	public static void removeDuplicateNumbers(int [] values)
	{
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i =0;i<values.length;i++)
		{
			arrList.add(values[i]);
		}
		System.out.println(arrList);
		List<Integer> distinct =  arrList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
	}
	public static void removeDuplicateNumbers(int [] values,int val)
	{
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
		for(int i=0;i<values.length;i++)
		{
			list.add(values[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println(list);
	}
	public static void removeDuplicateChar(char [] chr)
	{
		System.out.println("==================================================");
		LinkedHashSet<Character> chrList = new LinkedHashSet<Character>();
		for(int i=0;i<chr.length;i++)
		{
			chrList.add(chr[i]);
		}
		System.out.println(chrList);
	}
	public static void removeDuplicateChar(char [] chr,int val)
	{
		System.out.println("*************************************************");
		ArrayList<Character> chrList = new ArrayList<Character>();
		for(int i=0;i<chr.length;i++)
		{
			chrList.add(chr[i]);
		}
		System.out.println(chrList);
		List<Character> newDistinctChar = chrList.stream().distinct().collect(Collectors.toList());
		System.out.println(newDistinctChar);
		
	}
	public static void removeDuplicateString(String str[])
	{
		System.out.println("*************************************************");
		LinkedHashSet<String> newString = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			newString.add(str[i]);
		}
		System.out.println(newString);
		
	}
	public static void removeDuplicateString(String str[],int val)
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			list.add(str[i]);
		}
		System.out.println(list);
		List<String> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(newList);
		
	}
	public static void removeDuplicateWordFromString(String str)
	{
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		char ch [] =str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0;i<ch.length;i++)
		{
			list.add(ch[i]);
		}
		System.out.println(list);
		List<Character> newList= list.stream().distinct().collect(Collectors.toList());
		System.out.println(newList);
	}
	
}
