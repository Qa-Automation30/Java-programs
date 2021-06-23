package interViewOn18June;

public class FindFirstRepeatingCharInString {

	public static void main(String[] args) {
		String str="ei to iw t";
		boolean flag=false;
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					flag=true;
				}
			}
			if(flag)
			{
				System.out.println(str.charAt(i));
				break;
			}
			
		}

	}

}
