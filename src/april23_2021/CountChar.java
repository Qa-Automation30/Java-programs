package april23_2021;

public class CountChar {

	public static void main(String[] args) {
		String s = "Yes we can count the char";
		int count=0;
		int countSpaces=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				countSpaces++;
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);
		System.out.println(countSpaces);

	}

}
