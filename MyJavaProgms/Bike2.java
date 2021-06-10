
//if you have parameterised constructor in parent class then it becomes mandetory to use super keyword in subclass at first line to invoke parent class
//--constructor.
//if we have default constructor in parent class then super key word is not mandetory in subclass , it can implicitely 
//--call parent class constructor even if you havent put super keyword in subclass at first line
class Vehicle2
{
	Vehicle2()
	{
		this("Calling string constructor");// it will call default constructor
		System.out.println("Vehicle is running");
	}
	Vehicle2(int a)
	{
		this();// it will call default constructor also it is an example of constructor chainning.
		System.out.println("Vehicle is running with integer parameter");
	}
	
	Vehicle2(String s)
	{
		System.out.println("Vehicle is running with String parameter");
	}
	
	//if we want to call all constructor then we can user constructor chainning using this keyword as shown above
}
public class Bike2 extends Vehicle2 {
	
	Bike2()
	{
		super(5);
//		super(); //even if we are commenting this its implicitely callig parent class constructor
		System.out.println("Bike is Running.");
	}

	public static void main(String[] args)
	{
		Bike2 b=new Bike2();
	}

}
