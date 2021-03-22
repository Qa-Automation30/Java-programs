
public class SwapStrings {

	 public static String temp="";
	public static void main(String[] args) {
		String s1 = "Selenium";
		String s2 = "Automation";
		swapTwoStrings(s1,s2);
	}
	public static void swapTwoStrings(String str1,String str2)
	{
		System.out.println("First string str1-->"+str1);
		System.out.println("Second string str2-->"+str2);
		System.out.println("\n");
		temp=str1;
		System.out.println("Temp-->"+temp);
		str1=str2;
		System.out.println("After swapping string str1--->"+str1);
		str2=temp;
		System.out.println("After swapping string str2--->"+str2);
		System.out.println("Strings are swapped now");
	}

}
