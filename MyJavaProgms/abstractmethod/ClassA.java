package abstractmethod;
//abstract class can have all these below 
abstract public class ClassA 
{
	static int a=20;
	ClassA() //this constructor will not be invoked as class is abstract class and object cannot be created for abstratc class
	{
		a=30;
		System.out.println("Constructor ClassA is called.");
	}
	void m1() //concreate method//as well as non static method//can not call this method as it is non static method which require object to call but class is abstract class.
	{
	System.out.println("Method M1 is called from ClassA");
	}
	static void m2() // can be called directly in main method as it static method and main is also static method
	{
	System.out.println("Method M2 is called from ClassA");

	}
	abstract void m3(); //can not call this method as it is abstract as well as non static method which require object to call but class is abstract class.
	
	public static void main(String[] args) 
	{
		m2();
		System.out.println(a);
		// TODO Auto-generated method stub
// here only static method will be accessc
		//as static method can be called directly by static method and other methods are not static
//		and other are abtract and for abstartc methods we cannot create object to call those abstract methodsas well as constructor cannot be invoked
//		as it would required object to call but class is abstract so it cannot be invoked
	}

}
