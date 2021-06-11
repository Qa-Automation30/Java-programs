import java.util.ArrayList;
import java.util.List;

public class FrequencyofNumbers {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,9,8,7,6,5,4,3,1,2,4,5,6};
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
			if(!list.contains(arr[i]))
			{
				count++;
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
