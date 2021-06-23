package arrayConcept;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
		int arr[]={2,5,6,3,7,1};
		System.out.println("Original Array is-->"+Arrays.toString(arr));
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
