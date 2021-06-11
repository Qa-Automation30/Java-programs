
import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

class MyBook extends Book
{
  void setTitle(String s)
  {
	  title=s;
}
}
public class Main{
	
	public static void main(String []args){
	
		MyBook x =new MyBook();
		x.setTitle("vivek");
		System.out.println("The title is: "+x.getTitle());

		
	}
}
