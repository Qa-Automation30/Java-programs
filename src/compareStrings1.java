import java.util.ArrayList;

public class compareStrings1 {

	public static void main(String[] args) {
		
		//Check that two strings are same or not.
		
		String s1 = "vivek srivastava";
		String s2=  "vivek srivastava";
		compareStrings(s1,s2);
	}
	public static void compareStrings(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			System.out.println("Can not compare the strings as it is not same in length");
		}
		else
		{
			ArrayList<String> listStr1 = new ArrayList<>();
			listStr1.add(s1);
			ArrayList<String> listStr2 = new ArrayList<>();
			listStr2.add(s2);
			if(listStr1.containsAll(listStr2))
			{
				System.out.println("Both the strings are same");
			}
			else
			{
				System.out.println("Strings are not same");
			}
		}
	}

}
