package april23_2021;

public class StringReverse {

	public static void main(String[] args) {
		String str = "My name is vivek srivastava";
		String newStr = "";
		
		/*There could be number of outputs:
			1. srivastava vivek is name My
			2. avatsavirs keviv si eman yM
			*
			*
			*/
		String s [] = str.split(" ");  
		/* Split the string on the basis of spaces first and this 
		 split method returns array of string.
		the array of strings computed by splitting 
		this stringaround matches of the given regular expression*/
		
		for(int i=s.length-1;i>=0;i--)
		{
			newStr = newStr+" "+s[i];
		}
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		System.out.println("1st output-->"+newStr);
	}

}
