package arrayConcept;

public class FindMiniumNumberInArray {

	public static void main(String[] args) {
		int arr[]={2,5,6,3,7,1};
		int temp; 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
				}
			}
		}
		System.out.print(arr[0]);

	}

}
