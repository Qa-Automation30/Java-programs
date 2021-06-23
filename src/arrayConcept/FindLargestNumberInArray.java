package arrayConcept;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,32,66,1,67,87,12,10,1000};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[0]);

	}

}
