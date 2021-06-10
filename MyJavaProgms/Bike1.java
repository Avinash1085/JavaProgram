
class Vehicle1
{
	void show()
	{
		System.out.println("Vehicle is running");
	}
}
public class Bike1 extends Vehicle1 {

	void show()
	{
		System.out.println("Bike is running");
	}
	void display()
	{
		show();
		super.show();
		
	}
	public static void main(String[] args) {

		Bike1 B1=new Bike1();
		B1.display();
		//super is used to refer the method of immediate parent class.
//e.g: Method overriding is same method name with same signature in super and subclass.

	}

}
