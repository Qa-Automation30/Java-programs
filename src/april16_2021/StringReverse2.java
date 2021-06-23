package april16_2021;

public class StringReverse2 {

	public static String newStr="";
	public static void main(String[] args) {
		String s ="hello world hi hey";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String str)
	{
		  for (int i = 0; i < str.length(); i++) {
		   boolean unique = true;
		   for (int j = 0; j < str.length(); j++) {
		    if (i != j && str.charAt(i) == str.charAt(j)) {
		     unique = false;
		     break;
		    }
		   }
		   if (unique) {
		    System.out.println("The first non repeated character in String is: " + str.charAt(i));
		    return String.valueOf(str.charAt(i));
		   }
		  
		   }
		return " ";
	}

}	
