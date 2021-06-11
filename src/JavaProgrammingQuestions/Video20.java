package JavaProgrammingQuestions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Video20 {

	public static void main(String[] args) {
		
		// How to Print count of duplicate characters from String? 
		
		printDuplicateChar("vivek srivastava");
		
	}	
	public static void printDuplicateChar(String str)
	{
		if(str==null)
		{
			System.out.println("Null String");
			return;
		}
		else if(str.length()==1)
		{
			System.out.println("Single char string");
			return;
		}
		else if(str.isEmpty())
		{
			System.out.println("Empty String");
			return;
		}
		else
		{
			char[] chr = str.toCharArray(); //java
			HashMap<Character, Integer> map = new HashMap<>();
			for(Character ch : chr)
			{
				if(map.containsKey(ch))
				{
					map.put(ch, map.get(ch)+1);
				}
				else
				{
					map.put(ch, 1);
				}
			}
			Set<Entry<Character, Integer>> set = map.entrySet();
			for(Entry<Character, Integer> entry : set)
			{
				if(entry.getValue()>1)
				{
					System.out.println(entry.getKey() +"--->"+entry.getValue());
				}
			}
		}
	}

}
