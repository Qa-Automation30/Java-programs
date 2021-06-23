package arrayConcept;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		// 1st way to sort using Arrays class in java
		
		int arr[] = {3,4,11,8,4,2,77,44,12,0,1,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//2nd way to sort an Array
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
