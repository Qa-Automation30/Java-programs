
public class SwapNumbers {
	public static int temp;
	public static void main(String[] args) {
	int num1 =-1;
	int num2 =1;
	Swapnumbers(num1,num2);
	swapNumber(num1,num2);
	}
	public static void Swapnumbers(int a, int b)
	{
		System.out.println("Before swap A-->"+a +"\n"+"Before swap B-->"+b);
		temp = a;
		System.out.println("Temp value--->"+temp);
		a=b;
		System.out.println("After swap A--->"+a);
		b=temp;
		System.out.println("After swap B--->"+b);	
	}
	public static void swapNumber(int x, int y)
	{
		System.out.println("\n");
		System.out.println("Before swap X-->"+x +"\n"+"Before swap Y-->"+y);
		x = x+y;
		System.out.println("\n");
		System.out.println("value of X--->"+x);
		y = x-y;
		System.out.println("After swapping value of Y--->"+y);
		x=x-y;
		System.out.println("After swapping value of X--->"+x);
	}

}
