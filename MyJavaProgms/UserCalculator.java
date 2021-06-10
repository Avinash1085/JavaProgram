import java.util.Scanner;
public class UserCalculator {

	public static void main(String[] args) {
		System.out.println("# Assignment No: 4.");
		System.out.println("Program Name : "+ "User Calculator.");
		System.out.println("----------* Accept the value from user and perform arithmatic operators *---------");
		
		int a  ,b;
//		Scanner input=new Scanner(System.in);
		
//        int n=0;
        
		a=getValueOfA();
		b=getValueOfB();

			
//		System.out.println("Enter the Value of A : ");
//		a=input.nextInt();
//		System.out.println("Enter the Value of B: ");
//		b=input.nextInt();
//		System.out.println("Value of A : "+a +"\nValue of B : "+b);
		

		int addition=a+b;
		System.out.println("\n****** Use of '+' operator *******");
		System.out.println("Value of num1 is : "+a+" &"+" Value of num2 is : "+b);

		System.out.println("So addition / sum of these two numbers is : "+addition);
		
		int subtraction=a-b;
		System.out.println("\n****** Use of '-' operator *******");
		System.out.println("Subtraction result of '"+a + " - " +b +"' is : "+subtraction);
		
		int multi=a*b;
		System.out.println("\n****** Use of '*' operator *******");
		System.out.println("Multiplication result of '"+a + " * " +b +"' is : "+multi);
	
		int div=a/b;
		System.out.println("\n****** Use of '/' operator *******");
		System.out.println("Division of '"+a + " / " +b +"' is : "+div);
		
		int rem=a%b;
		System.out.println("\n****** Use of '%' operator *******");
		System.out.println("Reminder of this expression '"+a + " % " +b +"' is : "+rem);


	}
	
	public static int getValueOfA()
	{
		int a=0;
		boolean flag;
        
        do
        {
        	try
        	{
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter value for A:  ");
                        a=sc.nextInt();
                        flag=false;
        	}
        	catch(Exception e)
        	{
        		// accept integer only.
        		System.out.println("Enter only integer value.."+e);
        		flag=true;
        	}
        }
        while(flag);
        return a;
	}
	
	public static int getValueOfB()
	{
		boolean flag;
		int b=0;
        do
        {
        	try
        	{
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Enter value for B ");
                        b=sc1.nextInt();
                        flag=false;
        	}
        	catch(Exception e)
        	{
        		// accept integer only.
        		System.out.println("Enter only integer value.."+e);
        		flag=true;
        	}
        }
        while(flag);
        return b;
	}

}
