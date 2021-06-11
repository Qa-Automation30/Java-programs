import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Fibonacci {

	static int age;
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.print(num1 + " " + num2);
		for (int i = 2; i <= 10; i++) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
		
		
		LinkedList<Integer> test = new LinkedList<>();
		test.add(5);
		test.add(1);
		test.add(10);
		System.out.println(test);
		
		System.out.println(age);
		
		int [] arr = {1,1,2,3,4,5,6,7,2,3,4,5,6,7,8,9,10,11,2,3,4,99};
		ArrayList<Integer> test1 = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			test1.add(arr[i]);
		}
		System.out.println(test1);
		HashSet<Integer> set = new HashSet<>(test1);
		ArrayList<Integer> newList = new ArrayList<>(set);
		System.out.println(newList);
		
		
		
		List<Integer> list11=test1.stream().distinct().collect(Collectors.toList());
		System.out.println(list11);
	}

}
