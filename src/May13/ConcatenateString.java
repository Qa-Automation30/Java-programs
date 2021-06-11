package May13;

public class ConcatenateString {

	public static String concatinateString(String str,int num)
	{
		if(num<=0)
		{
			return str;
		}
		if(str.length()==1)
		{
			return "Please enter a valid string";
		}
		String s1="";
		for(int i=0;i<num;i++)
		{
			s1=s1+""+str;
		}
		return s1;
	}
	public static void main(String[] args) {
		String s ="pH";
		System.out.println(concatinateString(s,2));

	}

}
