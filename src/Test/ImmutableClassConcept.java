package Test;

public final class ImmutableClassConcept {
	
	final String panCard;  // ye class ke data members hote hai.
	
	public ImmutableClassConcept(String pandcard)
	{
		this.panCard = pandcard;
	}
	
	public String getpancardNumber()
	{
		return panCard;
	}
	
	public static void main(String[] args)
	{
		ImmutableClassConcept s = new ImmutableClassConcept("BUHPS3277D");
		System.out.println(s.getpancardNumber());
	}
	
	/*
	 hum bhi create kar sakre hai immutable class --> wo aise ki class ko final bana de and uske jitne bhi
	 data members hai unko bhi final bana de.
	 
	 point to be noted here--> Jab hum class ko final bana dege to koi dossri class use extend nai kar payegi
	  point to be noted here--> Jab hum class ke data members ko final bana dege to to usko fir hum set nai kar sakte, means setter method se usko set nai kar sakte hai.
	 
	 * 
	 * 
	 * */
}
