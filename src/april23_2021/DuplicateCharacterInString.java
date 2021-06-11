package april23_2021;

import java.util.ArrayList;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		 String s = "Vivek Srivastava";
		 char [] chr = s.toLowerCase().toCharArray();
		 char ch = 0;
		 ArrayList<Character> list = new ArrayList<>();
		
		 for(int i=0;i<chr.length;i++)
		 {
			 if(!list.contains(chr[i]))
			 {
				 list.add(chr[i]);
				 int count=0;
				 count++;
				 for(int j=i+1;j<chr.length;j++)
				 {
					 if(chr[i]==chr[j])
					 {
						 ch=chr[j];
						 count++;
					 }
				 }
				if(count>=2)
				{
					 System.out.println(ch+"-->"+count);
				}
			 }
			
		 }
		 System.out.println(list);
		
		 
	}

}
