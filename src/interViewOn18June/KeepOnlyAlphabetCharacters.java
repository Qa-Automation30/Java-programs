package interViewOn18June;

public class KeepOnlyAlphabetCharacters {

	public static void main(String[] args) {
		String newstr = "Word#$#$% Word 1234".replaceAll("[^A-Za-z]+", "");
		System.out.println(newstr);

	}

}
