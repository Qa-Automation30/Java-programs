package StringConcepts;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	    void removeDuplicates(String str)
	    {
	        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
	        for(int i=0;i<str.length();i++)
	            lhs.add(str.charAt(i));
	        for(Character ch : lhs)
	            System.out.print(ch);
	    }
	      
	    /* Driver program to test removeDuplicates */
	    public static void main(String args[])
	    {
	        String str = "kratikavivek";
	        RemoveDuplicates r = new RemoveDuplicates();
	        r.removeDuplicates(str);
	    }

}
