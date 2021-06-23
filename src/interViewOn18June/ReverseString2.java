package interViewOn18June;

public class ReverseString2 {

	public static void main(String[] args) {
		String s ="This is test automation";
		String s1[] = s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
		//output-> automation test is This 
	}

}
