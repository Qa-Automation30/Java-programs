package StringConcepts;

public class VowlesAndConsonent2 {

	static int vowelCount=0;
	static int totalChar=0;
	public static void main(String[] args) {
		String str = "This is a really simple sentence";
		countVowelAndConsonent(str);
	}

	public static void countVowelAndConsonent(String str)
	{
		String s1 = str.toUpperCase();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
					{
						vowelCount++;
					}
		}
		System.out.println("Total Voewl--->"+vowelCount);
		System.out.println("Total Consonent-->"+(str.replaceAll("\\s", "").length()-vowelCount));
	}

}
