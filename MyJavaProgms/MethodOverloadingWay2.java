
public class MethodOverloadingWay2 {

	public static void main(String[] args) 
	{
		MethodOverloadingWay2 obj=new MethodOverloadingWay2();
		obj.sum(23,12);
		obj.sum(2.3f, 3.0f);
		obj.sum(4.5f,6);
		
	}
	
	void sum(int a, int b)
	{
		System.out.println("Sum of Integer values : "+(a+b));
	}
	
	void sum(float a, int b)
	{
		System.out.println("Sum of Integer & Float values : "+(a+b));
	}
	void sum(float a, float b)
	{
		System.out.println("Sum of Float values : "+(a+b));
	}
	
}
