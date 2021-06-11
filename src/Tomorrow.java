public class Tomorrow {

	public static void main(String[] args) {

		String str = "tomorrow";
		String newStr = "";
		int occurance = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o') {
				occurance++;
				for (int j = 0; j < occurance; j++) {
					newStr = newStr + "$";
				}
			} else {
				newStr = newStr + str.charAt(i);
			}

		}
		System.out.println(newStr);
	}
}
