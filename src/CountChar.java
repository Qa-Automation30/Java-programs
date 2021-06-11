
public class CountChar {

	//Java Program to count the total number of characters in a string
	static int j=0;
	public static void main(String[] args) {
		String str = "Test Automation";
		countCharacters(str);
		
		String str1= "This#string%contains^special*characters&.";   
		str = str1.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(str1);  
	}
	public static void countCharacters(String str)
	{
		String s = str.replaceAll(" +", "");
		System.out.println(s);
		System.out.println("Total number of characters->"+str.length());
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				j++;
			}
		}
		System.out.println(j);
	}

}
