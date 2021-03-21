
public class VowlesAndConsonent {

	static String str;
	static int count;
	public static void main(String[] args) {
		str = "This is a really simple sentence";
		CountVowelConsonant(str);
	}
	public static void CountVowelConsonant (String str)
	{
		str = str.toLowerCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='i'|| str.charAt(i)=='e' ||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}			
		System.out.println("total Vowel--> "+count);
		System.out.println("total consonent-->"+(str.trim().replaceAll(" +", "").length()-count));
	}
}
