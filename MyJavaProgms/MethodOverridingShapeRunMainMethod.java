//example of run time polymorphysm
class Shape
{
	void draw()
	{
		System.out.println("No Shape");
	}
}
class Circle extends Shape
{
	void draw() //method overrinding
	{
		System.out.println("Drawing a Circle");

	}
}
class Rectangle extends Shape
{
	void draw()//method overriding
	{
		System.out.println("Drawing Rectangle");

	}
}

class Triangle extends Shape
{
	void draw()//method overriding
	{
		System.out.println("Drawing Triangle");

	}
}



public class MethodOverridingShapeRunMainMethod 
{
	public static void main(String[] args) 
	{
		Shape s;
		s=new Shape();
		s.draw();
		s=new Circle();//e.g of upcasting
		s.draw();
		s=new Rectangle();//e.g of upcasting
		s.draw();
		s=new Triangle();
		s.draw();
	}

}
