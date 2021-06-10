
public class Function {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int result=addition(a,b);
		System.out.println("Sum is =>"+result);

	}
	public static int addition(int x , int y)
	{
		int sum;
		int value=test();
		sum=x+y;
		System.out.println("I am in addition!");
		print(value);
		return sum;
	}
	public static int test()
	{
		System.out.println("I am in test!");
		return 0;
	}
	public static void print(int value)
	{
		System.out.println("In print function -> Value"+value);
	}
	public static void click(int value)
	{
		System.out.println("In click function -> Value"+value);
	}

}
