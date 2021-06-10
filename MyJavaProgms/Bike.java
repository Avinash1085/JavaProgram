
//Super keyword is used to refer the instance variable of immediate parent class.
//Super and this keyword cannot be used in static context/method.
//super is used to refer the method of immediate parent class.

class Vehicle
{
	int speed=70;
}
public class Bike extends Vehicle 
{

	int speed=90;
	void show()
	{
		System.out.println("Speed of bike is : "+speed);
		System.out.println("Speed of vehicle is : "+super.speed);
	}
	
	public static void main(String[] args) 
	{
		Bike b=new Bike();
		b.show();
		// example of super keyword

	}

}
