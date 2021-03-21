
public class StringReverse {
	static String revstring="";
	public static void main(String[] args) {
		String str = "Test Automation";
		System.out.println(str);
		reverseString(str);
	}
	public static void reverseString(String str)
	{
		System.out.println("Length of string-->"+ str.length());
		System.out.println("1-->"+str.trim());
		System.out.println("2-->"+str.trim().replaceAll(" +", ""));
		String trimStr = str.trim().replaceAll(" +", "");
		char c[]= trimStr.toCharArray();
		System.out.println(c.length);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		System.out.println("");
		for(int i=c.length-1;i>=0;i--)
		{
			revstring = revstring+c[i];
		}
		System.out.print(revstring);
		System.out.println("");
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}

}
