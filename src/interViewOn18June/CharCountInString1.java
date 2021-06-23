package interViewOn18June;

public class CharCountInString1 {

	public static void main(String[] args) {
		String s ="testtt";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='t')
			{
				count++;
			}
			
		}
		System.out.println(count);
		

	}

}
