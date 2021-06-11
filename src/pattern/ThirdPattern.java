package pattern;

public class ThirdPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<27;i++)
		{
			int count=65;
			for(int j=1;j<=i;j++)
			{
				char c = (char) count++;
				System.out.print(" "+c);
			}
			System.out.println("");
		}

	}

}
