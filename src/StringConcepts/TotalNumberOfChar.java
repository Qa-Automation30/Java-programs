package StringConcepts;

public class TotalNumberOfChar {
	
	public static void main(String[] args) {
		String str ="coding practice";
		numberOfChar(str);
		numberofchar2(str);
	
	}
	public static void numberOfChar(String s1)
	{	int count=0;
		System.err.println(s1.length());
		System.out.println(s1.trim().replaceAll(" +", ""));
		System.out.println(s1.trim().replaceAll(" +", "").length());
		for(int i=0;i<s1.trim().replaceAll(" +", "").length();i++)
		{
			System.out.println(count++);
		}
		System.out.println("\n");
		System.out.println(count);
	}
	public static void numberofchar2(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
