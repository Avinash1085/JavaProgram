package abstractmethod;

////abstract class may or may not have abstract methods but if a class is having abstract method then class should be declared asa abstract class
//abstract class cannot be instantiated.
abstract class Shape
{
	abstract void draw();
	
}
class Circle extends Shape
{
	
	@Override
	void draw() 
	{
		System.out.println("Circle from Abstract method");
// TODO Auto-generated method stub
		
	}
}
//abstract method->a method without body
//whenever a class has atleast one abstract method, class shouldd also be declared as abstract
//abstract class->cannot be instantiated, need to be extended
//abstract class may or may not have abstract method
//abstract method of superclass should be overridden by subclass
//or subclass should be declared as abstract

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle");
	
	}
}
abstract class Triangle extends Shape
{
	
}
class UpperTriangle extends Shape
{
	void draw()
	{
		System.out.println("UpperTriangle");
		
	}
}
public class ShapeAbsrct 
{
public static void main(String[] args) {
	{
		Circle c =new Circle();
		Rectangle r=new Rectangle();
		UpperTriangle ut =new UpperTriangle();
		c.draw();
		r.draw();
		ut.draw();
	}
}
}
