package interViewOn18June;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		String s ="the cost of your items are 50$";
		String newStr = s.replaceAll("[^0-9]","");
		System.out.println(newStr);
		
		if(Integer.parseInt(newStr)>=50)
		{
			System.out.println("OK click");
		}

	}

}
