package april23_2021;

public class Tomorrow {

	public static void main(String[] args) {
		String s = "Tomorrow";
		String newStr="";
		int count=0;
		char [] c = s.toLowerCase().toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='o')
			{
				count++;
				for(int j=0;j<count;j++)
				{
					newStr = newStr +"$";
				}
			}
			else
			{
				newStr = newStr+c[i];
			}
			
		}
		System.out.println(newStr);

	}

}
