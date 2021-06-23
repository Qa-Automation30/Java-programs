package methodOverridingConcept;

public class ChildClass extends ParentClass {
	
	@Override
	public void parentmarriage()
	{
		System.out.println("mai apni marji se shadi karuga");
	}
	public void methodBelongstoB()
	{
		System.out.println("hence proved");
	}
	public static void main(String args[])
	{
		//Child class ka object and child class ka refrence
		ChildClass obj = new ChildClass();
		obj.parenteducation();
		obj.parentmarriage();
		obj.parentproprty();    
		
		//====================================
		System.out.println("==============");
		//parent class ka object and parent class ka refrence
		ParentClass obj1 = new ParentClass();
		obj1.parenteducation();
		obj1.parentmarriage();
		obj1.parentproprty();
		
		//====================================
		System.out.println("==============");
		//parent class ka refrecne and child class ka object
		ParentClass p1 = new ChildClass();
		p1.parenteducation();
		p1.parentmarriage();
		p1.parentproprty();
	}

}
