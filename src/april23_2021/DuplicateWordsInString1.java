package april23_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateWordsInString1 {

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
			String [] newStr = originalStr.toLowerCase().split(" ");
			String s1 ="";
			
			for(int i=0;i<newStr.length;i++)
			{
				int count=1;
				for(int j=i+1;j<newStr.length;j++)
				{
					if(newStr[i].equals(newStr[j]))
					{
						s1 = newStr[j];
						count++;
					}
						
				}
				if(count>2)
				{
					System.out.println(count+"---->"+s1);
				}
					
			}
			

	}

}
