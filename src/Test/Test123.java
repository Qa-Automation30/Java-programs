package Test;

import java.util.ArrayList;

public class Test123 {

	public static void main(String[] args) {
		String s ="AGAGAGABCBCCCDDDDEEEG";
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
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
					System.out.print(s.charAt(i)+""+count);
			}
			
		}
		
	}		
}
