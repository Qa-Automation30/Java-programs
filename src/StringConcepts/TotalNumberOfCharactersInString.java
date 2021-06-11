package StringConcepts;

public class TotalNumberOfCharactersInString {

	static int count=0;
	public static void main(String[] args) {
		
		String str = " Test Automation ";
		System.out.println(str.length()); // iska length 17 isliye hai bcs yaha pe white spaces bhi count ho raha hai.
		System.out.println(str.trim().length()); // trim() method string ke shuru me and last me agar koi white spaces ho to usko
		// trim karta hai. naa ki beech me agar koi white space hai usko. jaise Test and Automation ke beech me hai.
		/* This trim() method may be used to trim whitespace
		 *  (as defined above) from the beginning and end of a string.*/
		MethodOne_CountCharactersInString(str);
		MethodTwo_CountCharactersInString(str);
	}
	
	public static void MethodOne_CountCharactersInString(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of character in string->"+count);
	}
	public static void MethodTwo_CountCharactersInString(String str)
	{
		/* Isme string se white space hata diye with the help of regulare expression.
		 * str.replaceAll("\\s","");
		 * */
		String s = str.replaceAll("\\s","");
		System.out.println(s.length());
	}
}
