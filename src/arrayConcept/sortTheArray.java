package arrayConcept;

import java.util.Arrays;

public class sortTheArray {

	public static void main(String[] args) {
		//Need to sort the array
		int [] arr = {55,32,66,1,67,87,12,10};
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
