package Test;

public class StringBufferConcept {

	public static void main(String[] args) {
		/*
		 1. StringBuffer class ka use ku karte hai ?  --> wo isliye karte hai taki hum String ko mutable bana sake. It means hum string ke content me change kar sake.
		 
		 2. The diff b/w String and StringBuffer class is --> String class immutable hoti hai, jabki StringBuffer class mutbale hoti hai.
		 
		 3. ek aur important baat -> StringBuffer class thread safe hoti hai -> iska kya matlab hota hai. iska matlab hota hai 1 time me 1 hi thread string pe kaam kar sakta hai
		 
		 4. StringBuffer calss ke teen constructor hote hai-->
		  		a-> StringBuffer() --> iska default initial capacity 16 hota hai. 
		  		b-> StringBuffer(String str) --> is constructor me ek specified string pass karte hai.
		  		c-> StringBuffer(int capacity) --> hum initial capactiy string ki apne hisab se de sakte hai. 
		 */
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer("Test");
		StringBuffer s3 = new StringBuffer(10);
		s3.append("1111111111111");
		System.out.println(s3);
		//=========================================================================================
		
		/*
		 	1. StringBuilder class->  ye class bhi mutable string ko create karne ke liye use hota hai. 
		 	2. The imp diff b/w StringBuffer and StringBuilder class is -> StringBuffer ThreadSafe hai , jabki 
		 		StringBuilder Thread safe nai hai.   StringBuilder jdk 1.5 me aya tha. 
		 		
		 	baki sara StringBuffer jaisa hi hai StringBuilder me. 
		 	Constructors and methods sab same hi hai almost.
		 * 
		 * 
		 * 
		 * */
	}

}
