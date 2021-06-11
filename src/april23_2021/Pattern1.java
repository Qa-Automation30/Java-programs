package april23_2021;

public class Pattern1 {

	public static void main(String[] args) {
		
	/*	*
		**
		***
		****
		*****
		******
		********/
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("===================");
	/*	1
		12
		123
		1234
		12345
		123456
		1234567
		12345678
		123456789*/
		
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("===================");
		
		/********
		******
		*****
		****
		***
		**
		**/
		for(int i=6;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("===================");
	/*	*
		**
		***
		****
		*****
		******
		*******
		******
		*****
		****
		***
		**
		*       */
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=6;i>=0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("===================");
		
	/*	A
		AB
		ABC
		ABCD
		ABCDE
		ABCDEF
		ABCDEFG
		ABCDEFGH
		ABCDEFGHI*/
		
		for(int i=1;i<10;i++)
		{
			int c = 65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)c++);
			}
			System.out.println("");
		}
		System.out.println("===================");
	/*	A
		BB
		CCC
		DDDD
		EEEEE
		FFFFFF
		GGGGGGG
		HHHHHHHH
		IIIIIIIII*/
		
		int c = 65;
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				char ch = (char)c;
				System.out.print(ch);
			}
			System.out.println("");
			c++;
		}
	}
	
}
