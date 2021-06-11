package JavaProgrammingQuestions;

public class ThirdPrograme {

	public static void main(String[] args) {
		
		//What will be the output when you divide a number by zero?
		//explained one tricky java interview question: What will be the output when you divide a number by zero?

		try {
			System.out.println(9/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You can not divide any number by zero");
		}
		System.out.println(12.22f/0);  // Infinity
		System.out.println(10/0.0);   // Infinity
		System.out.println(19.99999d/0); // Infinity
		System.out.println(0.0/0); //NaN
		System.out.println(0/0.0); //NaN
		System.out.println(0.0/0.0); //NaN
		System.out.println(12.0/0); //Infinity
		System.out.println(12.33/0.0); //Infinity
		
	}

}	