package april12_2021;

public class Anagram1 {
	static char c1[];
	static char c2[];
	static String s1 ="hBJk";
	static String s2 ="jHbK";
	static char temp;
	public static void main(String[] args) {
		/*Two Strings are called the anagram if they contain the same characters. 
		 * However, the order or sequence of the characters can be different.*/
		
		checkAnagarm(s1,s2);

	}
	public static void checkAnagarm(String s1, String s2)
	{
		if(!(s1.length()==s2.length()))
		{
			System.out.println("String's length does not match");
		}
		else if(s1.length()==0 || s2.length()==0)
		{
			System.out.println("Please enter a valid string");
		}
		else
		{
			String res1=" ";
			c1= s1.toLowerCase().toCharArray();
			for(int i=0;i<c1.length;i++)
			{
				for(int j=i+1;j<c1.length;j++)
				{
					if(c1[i]>c1[j])
					{
						temp = c1[i];
						c1[i] =c1[j];
						c1[j] =temp;
					}
				}
				 res1=res1+c1[i];
			}
			System.out.println(res1);
			
			String res2=" ";
			c2= s2.toLowerCase().toCharArray();
			for(int i=0;i<c2.length;i++)
			{
				for(int j=i+1;j<c2.length;j++)
				{
					if(c2[i]>c2[j])
					{
						temp = c2[i];
						c2[i] =c2[j];
						c2[j] =temp;
					}
				}
				 res2=res2+c2[i];
			}
			System.out.println(res2);
			boolean b =res1.equals(res2);
			System.out.println(b);
			
	}

}

}
