package interViewOn18June;

import java.util.ArrayList;

public class FindUniqueWordsInString {

	public static void main(String[] args) {
		String s ="test automation";
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			if(!list.contains(s.charAt(i)))
			{
				list.add(s.charAt(i));
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
				}
				if(count==0)
				{
					System.out.println(s.charAt(i)+"->"+count);
				}
				
			}
			
		}
		
		

	}

}
