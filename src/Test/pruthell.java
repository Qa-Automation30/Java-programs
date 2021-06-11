package Test;

import java.util.ArrayList;

public class pruthell {

	public static void main(String[] args) {
		int [] arr = {12,3,4,3,4,12,1};
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
				if(count==1)
				{
					System.out.println(arr[i]+"-->This is unique number in array");
				}
					
			}
			
		}
		

	}

}
