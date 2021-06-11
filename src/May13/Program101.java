package May13;

public class Program101 {

	public static void main(String[] args) {
		String s1 ="13a12";
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}

}
