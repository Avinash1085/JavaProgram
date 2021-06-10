
public class OverloadingMainMethod {

	public static void main(String[] args) 
	{
		System.out.println("Main with String array ");
		OverloadingMainMethod obj =new OverloadingMainMethod();
		obj.main(3.4f);
		obj.main(20);
		main(34);
		main(6.7f);
		//obj.main("Hello Avinash",0);
	}
	public static void main(int a) 
	{
		System.out.println("Main with int "+a);

	}
	public static void main(float s) 
	{
		System.out.println("Main with float array "+s);

	}


}
