package arrayConcept;

import java.util.ArrayList;

public class FrequencyOfAumberInAnArray {

	public static void main(String[] args) {
		int arr[]= {0, 5, 5, 5, 4};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			count++;
			if(!list.contains(arr[i]))
			{
				list.add(arr[i]);
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
					count++;
				}
				}
				System.out.println(arr[i]+"-->"+count);
			}
			
		}
	}

}
