package april23_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceWords {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==0)
			{
				list.remove(list.get(i));
			}
		}
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==1)
			{
				list.remove(list.get(i));
			}
		}
		System.out.println(list);

	}

}
