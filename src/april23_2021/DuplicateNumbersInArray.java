package april23_2021;

import java.util.ArrayList;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,9,8,7,6,5,4,3,1,2,4,5,6,100,22,33,44,33};
		ArrayList<Integer> list = new ArrayList<>();
		int num = 0;
	
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
						num=arr[j];
						count++;
					}
				}
				if(count>=2)
				{
					System.out.println(num+"--->"+count);
				}
			}
				
		}
		

	}

}
