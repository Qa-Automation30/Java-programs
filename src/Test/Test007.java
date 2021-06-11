package Test;

import java.util.ArrayList;

public class Test007 {
	public static void main(String[] args) {
		String s ="1B3A2D4C";
		String output="";
		
		int len =s.length();
		int n=8;
		int temp=0, chars = len/n;
		String newStr [] = new String[n];
		ArrayList<Object> list = new ArrayList<Object>();
		
		for(int i=0;i<len;i=i+chars)
		{
			String part = s.substring(i, i+chars);  
			newStr[temp] = part;  
            temp++;  
		}
	    for(int i = 0; i < newStr.length; i++) {  
            list.add(newStr[i]);  
            }
	    System.out.println(list);
	    for(int i=0;i<list.size();i++)
	    {
	    	if(Integer.parseInt((String) list.get(i))>=1)
	    	{
	    		System.out.println("");
	    	}
	    	else
	    	{
	    		System.out.println("x");
	    	}
	    }
	}
}
