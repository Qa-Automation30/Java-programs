package arrayConcept;

public class PrintOddAndEvenNumbersFromAnArray {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("This is even number"+a[i]);
			}
			else
			{
				System.out.println("This is odd number"+a[i]);
			}
		}

	}

}
