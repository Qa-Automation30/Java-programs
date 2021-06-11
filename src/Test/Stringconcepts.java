package Test;

public class Stringconcepts {

	public static void main(String[] args) {
		
		//hashcode does not equals to address. (hashcode != address)
		
		/*two ways se string object ko create kar sakte hai.
		1. by using string literal --> example : String s1 ="test" so string literal bole koi agar 
		to wo aise create hoyta hai--> (String s1 = "this is example of string literal")
		
		String literal --> what does it mean-->
		aap jitne baar string literal create karege  utni baar JVM "string constant pool" me check karega--> kya check karega wo question hai?
		
		agar string literal phle se us string constant pool me pada hai to wo wai instance returend kar dega, new create nai karega.
		means -->
		String s1 ="test"; String s2= "test"
		s1 and s2 --> dono ek hi jagha indicate karege. 
		
		Note: String objects are stored in a special memory area known as the "string constant pool".
		
		String literal ka fayda kya hai --> memory efficient hai -- >kaise? agar phele se string exist karti hai to naya obejct create nai hotta hai.
		
		String constant pool --> never creats duplicate objects.
		===========================================================================================
		
		agar string exist nai karta hai string constant pool me to ek new instance create hota hai pool me.
		example --> String s3 ="check";
					
		===============================================================================
		2. by using new keyword --> example : String s2 = new string("test")
		=========================================================================
		3. What is the diff b/w == and .equals()-->
		
		(a) ==  --> This is an operator and .equals()--> is a method.
		(b) == --> ye operator reference comparison ke liye use hota hai. means ye tabi true return
					krega jab dono object same memory allocation me point hoge.
					(In simple words, == checks if both objects point to the same memory location)
					
		(c) .equals()--> method objects ki values ko compare karne ke liye hota hai.( .equals() method for content comparison. )
		
		*/
		String s1 ="test";
		String s2 ="test";
		String s3= "test";
		String s4 ="Test";
		String s5 ="test1";
		String s6 ="test1";
		

		
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s4);   //false
		System.out.println(s1.equals(s4)); //false
		
		
		
		String s7 = new String("HELLO");
        String s8 = new String("HELLO");
        /*
         * 	yaha pe s7 and s8 dono diffrent object ko refer kar rai hai.
         * to s7 ka address alag hoga and s8 ka address alag hoga so jab s7==s8 karege to result false ayega.
         * address 
         * */
        
      //hashcode does not equals to address(hashcode != address) so hashcode ke base pe nai bol sakte ki address kya hone wala hai.
		System.out.println(s7.hashCode()); 
		System.out.println(s8.hashCode()); 
		
		System.out.println(String.valueOf(s7));
		System.out.println(String.valueOf(s8));
		
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8)); //true
		
		//================================================================
		/* Immutable String in Java
		 * 
		 * Immutable means --> jinko change nai kar sakte hai hum (unmodifiable or unchangeable)
		 * 
		 * agar 1 baar string object create kar diya to uske data(state) me koi change nai kar sakte hai. agar kuch change kiya to wo ek new 
		 * String object retrun karta hai.
		 * 
		 * 
		 * */
		
		String st = "exampe of immutable string";
		st.concat("again");  // jab hum yaha pe concatinate kar rai hai to string constant pool me ek new object create hota hai like "exampe of immutable string again" karke.but st object phle wale ko hi refer karta hai.
		System.out.println(st);
		System.out.println("=====");
		
		
		String st1 = "exampe of immutable string";
		String newStr = st1.concat(" again");
		System.out.println(st1);
		System.out.println(newStr);
		
		/* ab question ye hai ki ku string objects immutable hote hai.?
		 *  to uska answer ye hai ki-->  Bcs java String literal ka concept use karti hai.
		 *  suppose humare pass 4 refrence variable hai aur sab se sab 1 hi object to refer kar rai hai. 
		 *  
		 *	example : s1= "test"; s2="test"; s3="test" ;s4="test"
		 *
		 *agar ab mano s1 apka refrence varibale hai and s2 kisi aur ka(jo ki same object ko reffer kar rai hai), aur aap apne refrence variable se yani ki s1 se "test" ko change karke "test12" karna chahate ho
		 *	to is case me hoga kya ki "test" value s2,s3 and s4 sabke liye change ho jayegi , jo ki s2 s3 and s4 ne to koi request ki hi nai change karne ki right ?
		 * means "it will be affected to all the reference variables." so is case me hai "That is why string objects are immutable in java."
		 * */
		
		//==============================================================================================================
		
		//Java String compare-------->
		
		/* hum java me string compare kar sakte hai on the basis of content(means jo data hai) and reference
		 * 
		 * There are three ways to compare string in java:
		 
			By equals() method  ---> equals method string ke content(matlab ki unki values ko compare karta hai) ko compare karta hai.
			
			By = = operator  -->   ye refrences ko compare karta hai means unke addresses ko  
			[
			String s1="Sachin";  
   			String s2="Sachin";  
   			String s3=new String("Sachin");  
   			System.out.println(s1==s2);//true (because both refer to same instance)  
   			System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
			]
		 * */
		
		//====================================================================================================
		//Substring in Java --->
		
		/* substring means string ka hi part hai means original string ka hi ek part hai.
		 * String calss me substring ke two methods hote hai-->
		 * 	1. public String substring(int startIndex)
		 * 	2. public String substring(int startIndex, int endIndex)
		 * 
		 * hum jo bhi start index dege wo include hoga and endIndex execlude hoga ... example --->
		 * 	String s="hello";  
			System.out.println(s.substring(0,2));//he   ---> yaha pe start index 0 hai and endIndex 2 hai to zero se value count hogi jo include hogi and 2 wali value 
			exclude ho jayegi. so o/p--> "he" ayega.  bcs 'h' ka index [0] ye hai and 'e' ka index [1] hai and 'l' ka index [2] hai.  so 'l' exclude ho jayega. 
		 * 
		 * 
		 * String s="SachinTendulkar";  
   			System.out.println(s.substring(6));//Tendulkar    --> yaha pe sirf startindex diya hai means jo bhi start Index hai waha ki value ko include karke uske
   			baad ki sari values.
		 * 
		 * */
		//===========================================================================================================================
		/* String class me ek trim() method hota hai  ---> uska kaam kya hai pata hai?   
		 * 
		 * trim() method kaa kaam hota hai ki String me agar shuru me aur akhri me whitespaces hai to unko hatata hai.(The string trim() method eliminates white spaces before and after string)
		 * 
		 * 
		 * ------------------------------------------------------------------------------------------
		 * Java String valueOf() method-->
		 * The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.

			int a=10;  
			String s=String.valueOf(a);  
			System.out.println(s+10);  
			Output:1010
		 * 
		 * 
		 * */
		String a ="meow";
		String ab =a+"deal";
		String abc ="meowdeal";
		System.out.println(ab);
		System.out.println(abc);
		System.out.println(ab==abc); // false
		//==============================================================================
		String a1 =" wild ";
		String b1 =" wildd ";
		String c1 =" wilddd ";
		String result = a1.trim()+ b1.trim()+ 	c1.trim();
		System.out.println(result);
		//=================================================================================
		String str = "My name is vivek";
		String [] abb = str.split("\\s");  //splits the string based on whitespace  
		for(int i=abb.length-1;i>=0;i--)
		{
			System.out.print(" "+abb[i]);
		}
	}
	

}
