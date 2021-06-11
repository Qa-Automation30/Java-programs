package StringConcepts;


public class StringReverse_1 {

	public String strr="";
	public static void main(String[] args) {
		StringReverse_1 obj = new StringReverse_1();
		String str = "Reverse the String";
		obj.reverseString(str);
		obj.reverseString(str,1);
	}
	public void reverseString(String str)
	{
		System.out.println("Original String-->"+ str);
		StringBuffer newStr = new StringBuffer(str);
		System.out.println("Reversed String-->"+ newStr.reverse());
	}
	public void reverseString(String str,int value)
	{
		System.out.println("Original String-->"+ str);
		char ch [] = str.toCharArray();
		System.out.println(ch.length);
		for(int i=ch.length-1;i>=0;i--)
		{
			strr = strr+ch[i];
		}
		System.out.println(strr);
	}
}
