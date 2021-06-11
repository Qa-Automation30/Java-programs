package Test;

public class payTM {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*WAP to swap vowels present in a string:

			I/P: "Hello world Java"

			O/P: "Halla world Jove"*/
		
		String s = "Hello world Java";
		String newStr = s.replaceAll(" +", "");
		char c[] = s.toLowerCase().toCharArray();
		char temp;
		String ss="";
		for(int i=0;i<c.length;i++)
		{
			for(int j=c.length-1;j>=0;j--)
				{
					if((c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u') && ((c[j]=='a' || c[j]=='e' ||  c[j]=='i' ||  c[j]=='o' ||  c[j]=='u')))
					{
						temp = c[i];
						c[i]=c[j];
						c[j]=temp;
						break;
					}
					break;
				}
			ss =ss+c[i];	
		}
		System.out.println(ss);
		
		
	}

}
