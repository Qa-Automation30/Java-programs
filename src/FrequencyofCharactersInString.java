import java.util.ArrayList;

public class FrequencyofCharactersInString {

	public static void main(String[] args) {
		String str ="vivek srivastava";
		char [] charArray = str.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==' ')
			{
				
			}
			else
			{
			int count=0;
			if(!list.contains(charArray[i]))
			{
				count++;
				list.add(charArray[i]);
				for(int j=i+1;j<charArray.length;j++)
				{
					if(charArray[i]==charArray[j])
					{
						count++;
					}
					
				}
				System.out.println(charArray[i]+"-->"+count);
			}
		}
		

	}
	}
}
