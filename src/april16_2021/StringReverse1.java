package april16_2021;

public class StringReverse1 {
		public static String newcstr="";
		public static void main(String[] args) {
			String s ="String reverse concept";
			System.out.println(reverseString(s));
		}
		public static String reverseString(String str)
		{
			if(str.length()==0)
			{
				System.out.println("Can not revese the empty string");
			}
			else if(str.length()==1)
			{
				System.out.println("can not reverse the single character string");
			}
			else
			{
				char[] ch = str.toCharArray();
				for(int i=ch.length-1;i>=0;i--)
				{
					newcstr = newcstr + ch[i];
				}
			}
			return newcstr;
		}

}
