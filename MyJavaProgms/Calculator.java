
public class Calculator 
{
	public static void main(String[] args)
	{
		int num1,num2;
		num1=35;
		num2=20;
		
		System.out.println("# Assignment No: 3.");
		System.out.println("Program Name : "+ "Simple Calculator.");
		System.out.println("----------* Arithmatic expressions using different arithmatic operators *---------");
		
		int addition=num1+num2;
		System.out.println("\n****** Use of '+' operator *******");
		System.out.println("Value of num1 is : "+num1+" &"+" Value of num2 is : "+num2);

		System.out.println("So addition / sum of these two numbers is : "+addition);
		
		int subtraction=num1-num2;
		System.out.println("\n****** Use of '-' operator *******");
		System.out.println("Subtraction result of '"+num1 + " - " +num2 +"' is : "+subtraction);
		
		int multi=num1*num2;
		System.out.println("\n****** Use of '*' operator *******");
		System.out.println("Multiplication result of '"+num1 + " * " +num2 +"' is : "+multi);
	
		int div=num1/num2;
		System.out.println("\n****** Use of '/' operator *******");
		System.out.println("Division of '"+num1 + " / " +num2 +"' is : "+div);
		
		int rem=num1%num2;
		System.out.println("\n****** Use of '%' operator *******");
		System.out.println("Reminder of this expression '"+num1 + " % " +num2 +"' is : "+rem);
	}

}
