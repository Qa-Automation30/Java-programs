package april23_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
		String s[] = {"vivek", "vivek","Anoop","Ahmad","Ankit","Ankit"};
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		String s1="";
		
		/*vivek--->2
		Ankit--->2*/
		for(int i=0;i<s.length;i++)
		{
			int count =0;
			count++;
			if(!list.contains(s[i]))
			{
				for(int j=i+1;j<s.length;j++)
				{
					if(s[i]==s[j])
					{
						s1= s[j];
						count++;
					}
				}
			}
			if(count>=2)
			{
				System.out.println(s1+"--->"+count);
			}
		}
		for(int i=0;i<s.length;i++)
		{
			list2.add(s[i]);
		}
		System.out.println(list2);
	List<String> str=	list2.stream().distinct().collect(Collectors.toList());
	System.out.println(str);
		
	}

}
