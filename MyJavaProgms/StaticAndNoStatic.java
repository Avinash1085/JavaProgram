
public class StaticAndNoStatic {

	static int num=10;
	int num2=20;
	public static void main(String[] args) 
	{
		add();
//		sub();
	}
	public static void add()
	{
		System.out.println("In Addition function: "+num);//+num2);
	}
	
	public int sub()
	{
		System.out.println("In Subtraction function : "+(num+num2));
		return 0;
		
		//static functions can be accessed by only static function.
		//main function should be always static--java syntax.
		//non-static functions can not be called in or accessed by static function
		//if function is defined static and it is accessing global variable then that global variable also should be defined as static
		//global variables can be just declared if not initialised no errors can thrown.
		// if global variable is not initialised it will take default value of its data type
	
	
	}
}
