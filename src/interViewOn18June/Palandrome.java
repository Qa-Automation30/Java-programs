package interViewOn18June;

public class Palandrome {

	public static void main(String[] args) {
		String s1 ="madam";
		String temp="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			temp =temp+s1.charAt(i);
		}
		if(s1.equals(temp))
		{
			System.out.println("palaendrome");
		}
		else
		{
			System.out.println("not");
		}
	}

}
