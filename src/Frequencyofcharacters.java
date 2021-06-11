
public class Frequencyofcharacters {

	public static void main(String[] args) {
		String s = "vivek srivastava";
		Frequencyofcharacter(s);
	}

	public static void Frequencyofcharacter(String str) {
		int count = 0;
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (chr[i] == str.charAt(j)) {
					count++;
				}
			}
			System.out.println("Frequecny of->" + chr[i] + "-->" + count);
			count = 0;

		}
	}
}
