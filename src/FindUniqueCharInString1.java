import java.util.ArrayList;

public class FindUniqueCharInString1 {

	public static void main(String[] args) {
		String str1="ABC";
		String str2="abcds";
		
		String newStr = str1.toLowerCase()+str2.toLowerCase();
		char c1[] = newStr.toCharArray();
		
		ArrayList<Object> obj = new ArrayList<>();
		
		for(int i=0;i<c1.length;i++)
		{
			int count=0;
			if(!obj.contains(c1[i]))
			{
			count++;
			obj.add(c1[i]);
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]==c1[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(c1[i]);
			}
		}
		}
}
}