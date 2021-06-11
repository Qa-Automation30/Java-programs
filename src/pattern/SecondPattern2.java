package pattern;

public class SecondPattern2 {

	public static void main(String[] args) {
//		   	  *
//	         **
//	        ***
//	       ****
//	      *****
//	     ******
//	    ******* 
		
		for(int i=0;i<8;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
