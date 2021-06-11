package Test;

import java.util.ArrayList;
import java.util.List;

public class reverse {

	public static void main(String[] args) {
		String colon = "opertaions are selected : vivek,prutheel,file bound,Test case";
		 String[] strings = colon.split(":");
		 String newStr = strings[1];
		 System.out.println(newStr);
		 String[] s = newStr.split(",");
		 List<String> list = new ArrayList<String>();
		 for(int i=0;i<s.length;i++)
		 {
			list.add(s[i]);
		 }
		 System.out.println(list);
		
		/*String s ="01230";
		String newStr ="";
		char c[] = s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			newStr = newStr+c[i];
		}
		System.out.println(newStr);*/

	}

}
