package interViewOn18June;

import java.util.ArrayList;

public class CharCountInString {

	public static void main(String[] args) {
		String s ="world test championship";
		
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0;i<s.length();i++)
		{
			int  count = 0;
			count++;
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
				System.out.println(s.charAt(i)+"-->"+count);
			}
				
			}
	}

}
