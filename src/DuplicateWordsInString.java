//Java program to find the duplicate words in a string
public class DuplicateWordsInString {
	
	
	public static String str;
	public static void main(String[] args) {
		int count;
		String originalStr ="Big black bug bit a big black dog on his big black nose";
		str = originalStr.toLowerCase();
		String words[] =str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="0";
				}
			}
			if(count>1 && words[i] != "0")
			{
			System.out.println(words[i]);
			}
		}
		
	}
}
