import java.util.ArrayList;

public class DuplicateWordsInString1 {

	public static String[] str;
	public static void main(String[] args) {
		
		/* Java program to find the duplicate words in a string
	In this program, we need to find out the duplicate words present in the string and display those words.

	Example: big black bug bit a big black dog on his big black nose
	To find the duplicate words from the string, 
	we first split the string into words. 
	We count the occurrence of each word in the string. 
	If count is greater than 1, it implies that a word is duplicate in the string.
		 * */
		
		String originalStr ="Big black bug bit a big black dog on his big black nose";
		 str = originalStr.toLowerCase().split(" ");
		 ArrayList<String> list1 = new ArrayList<>();
		 for(int i=0;i<str.length;i++)
		 {
			 int count=0;
		 if(!list1.contains(str[i]))
		 {
			 count++;
			 list1.add(str[i]);
			 for(int j=i+1;j<str.length;j++)
			 {
				if(str[i].equals(str[j]))
				{
					count++;
					
				} 
			 }
			if(count>1)
			{
				System.out.println("The duplicate words are-->"+str[i]);
			}
		 }
		 
		 }
	}

}
