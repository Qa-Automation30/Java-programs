import java.util.HashSet;

public class asfasfasfs {

	
	public static String getSmallestAndLargest(String s, int k) {
		
	
	        String smallest = "";
	        
	        String largest = "";
	        
	        smallest = s.substring(0,k);
	        
	        largest = s.substring(0,k);
	        
	        for(int i=0; i<=s.length()-k; i++ )
	        {
	            String str = s.substring(i,k+i);
	            if (smallest.compareTo(str)>0){
	                smallest = str;
	            }
	            if(largest.compareTo(str)<0){
	                largest=str;
	            }
	        }  
	        
	        return smallest + "\n" + largest;
	    }
	    public static void main(String[] args) {
	 
	        System.out.println(getSmallestAndLargest("welcometojava", 3));
	        
	        int[] a;
	        a= new int[10];
	        
	        int a1[]= new int[10];
	        int [] a2 = new int[1];
	    }
	}

