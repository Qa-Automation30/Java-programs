
//find the common words in two strings.

public class compareStrings {
	static String s1 = "vivek";
	static String s2 = "vivek";
	static String str1;
	static String str2;
	static String o="";
	public static void main(String[] args)
	{
		str1 = s1.toLowerCase();
		str2 = s2.toLowerCase();
		compareTwoStrings(str1,str2);
		//comparestrings(str1,str2);
	}
	public static void compareTwoStrings(String str1, String str2)
	{
		for(int i=0;i<str1.length();i++)
		{
			System.out.println("print from s1 string--->"+str1.charAt(i));
			for(int j=0;j<str2.length();j++)
			{
				System.out.println("print from s2 string--->"+str2.charAt(j));
				if(str1.charAt(i)==str2.charAt(j))
				{
					System.out.println("Test-->"+(o=o+str2.charAt(j)));
				}
			}
		}
	}
	/*public static void comparestrings(String str1, String str2)
	{
		System.out.println(str1.equals(str2));
	}
*/
}
