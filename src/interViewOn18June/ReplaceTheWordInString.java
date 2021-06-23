package interViewOn18June;

public class ReplaceTheWordInString {

	public static void main(String[] args) {
		//Now replace t to A;
		String str ="test of taste is bad";
		String newStr="";
		char[] arr = str.toCharArray();
		char c='A';
		char temp;
		for(int i=0;i<arr.length ;i++)
		{
			if(arr[i]=='t')
			{
				temp=arr[i];
				arr[i]=c;
			}
			newStr=newStr+arr[i];
		}
		System.out.println(newStr);
	}

}
