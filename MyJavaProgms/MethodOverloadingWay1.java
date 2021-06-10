
public class MethodOverloadingWay1 {

	public static void main(String[] args) 
	{
		MethodOverloadingWay1 obj=new MethodOverloadingWay1();
		obj.area(4.5f);
		obj.area(4.5f, 6.1f);
		obj.area(2.3f, 3.2f, 3.4f);

	}
	void area(float r)
	{
		System.out.println("Area of Circle is : "+(3.14f*r*r));
	}
	int area(float l,float b)
	{
		System.out.println("Area of Rectangle is : "+(l*b));
		return 0;
	}
	
	void area(float l,float b,float h)
	{
		System.out.println("Triangle is : "+(l*b*h));

	}
}
