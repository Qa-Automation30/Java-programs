package arrayConcept;

import java.util.Arrays;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		//1st way to find smallest number in Array
		int arr[] = {3,4,11,8,4,2,77,44,12,0,1,7,-100,-200,-1};
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
		//2nd way to find smallest number in array
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
		System.out.println(arr[0]);
	}

}
