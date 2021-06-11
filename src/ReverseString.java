
public class ReverseString {
	
	public String revStr="";
	public static void main(String[] args) {
		String str = "Reverse the String";
		ReverseString revStr= new ReverseString();
		revStr.reverseString(str);
	}
	public void reverseString(String s1)
	{
		char charArray[] = s1.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
		System.out.println("\n");
		for(int i=charArray.length-1;i>0;i--)
		{
			System.out.print(charArray[i]);
		}
		System.out.println("\n");
		for(int i=charArray.length-1;i>0;i--)
		{
			revStr = revStr + charArray[i];
		}
		System.out.println(revStr);
		
	}

}
