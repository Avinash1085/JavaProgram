//10th April 2021 creating a method with return type of class Shape
import java.util.Scanner;
public class ReturnTypeofClass 
{
//	static Shape create() //method is created of return type of class Shape
	Shape create()
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu.\n1.Draw Circle.\n2.Draw Rectangle.\n3.Draw Triangle.");
		System.out.println("Enter your Choice : ");
		choice=sc.nextInt();
		if(choice==1)
		{
			Circle c=new Circle();
		return c;
	
		}
		else if(choice==2)
		{
			return new Rectangle();
		}
		else if(choice==3)
		{
			return new Triangle();
		}
		else
		return new Shape();
	}


	public static void main()
	{
	ReturnTypeofClass r=new ReturnTypeofClass();
//	Shape obj=new Shape(); //need to check what was return earlier bt Mahika before creating create method as static of type Shape
	Shape obj=r.create();
	obj.draw();
	}
}