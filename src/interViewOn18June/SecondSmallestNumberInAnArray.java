package interViewOn18June;

import java.util.Arrays;

public class SecondSmallestNumberInAnArray {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);
	}

}
