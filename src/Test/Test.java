package Test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String newStr="";
		String inputStr = "My name is vivek";
		// op = vivek is name my;
		String[]  s = inputStr.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			newStr =  newStr+" "+s[i];
		}
		System.out.println(newStr);
	
	}
	

}
