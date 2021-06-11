package May13;

import java.util.ArrayList;
import java.util.Collections;

public class SUJM {

	public static void main(String[] args) {
		int [] a = {-1,20,-3,66,-5,10};
		ArrayList<Integer> list = new ArrayList<>();
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum = a[i]+a[j];
				break;
			}
			list.add(sum);
		}
		System.out.println(list);
		System.out.println("Max sum of an array of two numbers->"+Collections.max(list));
	}

}
