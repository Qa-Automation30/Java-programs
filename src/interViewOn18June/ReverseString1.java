package interViewOn18June;

public class ReverseString1 {

	public static void main(String[] args) {
		String s ="my name is anoop sharma";
		String newStr="";
		String [] arrStr = s.split(" ");
		System.out.println(arrStr.length);
		for(int i=arrStr.length-1;i>=0;i--)
		{
			newStr = newStr+" "+arrStr[i];
		}
		System.out.println(newStr);
		//sharma anoop is name my
	}

}
