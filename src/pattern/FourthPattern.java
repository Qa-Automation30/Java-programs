package pattern;

public class FourthPattern {

	public static void main(String[] args) {
/*		A
		AB
		ABC
		ABCD	
		for(int i=1;i<=10;i++)
		{
			int count=65;
			for(int j=1;j<=i;j++)
			{
			char c = (char) count++;
			System.out.print(" "+c);
		}
			System.out.println();
		}*/
		
	/*	A
		BB
		CCC
		DDDD
		EEEEE*/
		int setCount = 65;
		for(int i=1;i<=10;i++)
		{ 
			for(int j=1;j<=i;j++)
			{
				char c = (char)setCount;
				System.out.print(" "+c);
			}
			System.out.println("");
			setCount++;
		}
	}

}
