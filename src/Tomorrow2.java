import java.util.ArrayList;
import java.util.Iterator;

public class Tomorrow2 {

	public static void main(String[] args) {
		String str = "tomorrow";
		int count=0;
		char ch[] = str.toCharArray();
		String newStr="";
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]=='o')
			{
				count++;
				for(int j=0;j<count;j++)
				{
				list.add('$');
			}}
			else
			{
				list.add(ch[i]);
			}
		}
		Iterator<Character> it = list.iterator();
		while(it.hasNext())
		{
			newStr = newStr+ it.next().toString();
		}
		System.out.println(newStr);
	}

}
