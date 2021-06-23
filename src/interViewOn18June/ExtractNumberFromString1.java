package interViewOn18June;

public class ExtractNumberFromString1 {

	public static void main(String[] args) {
		String s = "Automation1234Testing567";
		String s1 =s.replaceAll("[^0-9]","");
		
		System.out.println(s1);

	}

}
