package May13;

public class RemoveSpecificCharFromString {

	public static void main(String[] args) {
		String s1 = "abcdefabcdeabcdaaa";
		String s2="a";
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(0))
			{
				s3= s3+s1.charAt(i);
			}
		}
		System.out.println(s3);
	
	}

}
