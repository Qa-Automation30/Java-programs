package interViewOn18June;

public class NestedLoop {

	public static void main(String[] args) {
		//output will be :
		/*1
		12
		123
		1234
		12345*/
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
