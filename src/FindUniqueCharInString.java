import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//This is not right yet
public class FindUniqueCharInString {

	public static void main(String[] args) {
		String str1="abc";
		String str2="ab";
		
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		for(int i=0;i<str1.length();i++)
		{
			list1.add(str1.charAt(i));
		}
		for(int i=0;i<str2.length();i++)
		{
			list2.add(str2.charAt(i));
		}
		System.out.println(list1);
		System.out.println(list2);
		list1.removeAll(list2);
		System.out.println(list1);
		
	}
}
