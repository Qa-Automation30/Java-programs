package StringConcepts;

public class VowlesAndConsonent {

	public static void main(String[] args) {
		String str = "This is a really simple sentence";
		countVowel(str);
	}
	public static void countVowel(String str)
	{
		int lenght = str.trim().replaceAll(" +", "").length();
		int count=0;
		 char chr[] = str.toLowerCase().toCharArray();
		 for(int i=0;i<chr.length;i++)
		 {
			if(chr[i]=='a'||chr[i]=='e'|| chr[i]=='i' || chr[i]=='o' || chr[i]=='u')
			{
				count++;
			}
		 }
		 System.out.println("Total number of vowel->"+count);
		 System.out.println("Total number of consonent->"+(lenght-count));
	}
}
