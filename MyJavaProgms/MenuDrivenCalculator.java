import java.util.Scanner;

public class MenuDrivenCalculator 
{
	public static void main(String[] args) 
	{
		System.out.println("# Assignment No: 05.");
		System.out.println("Program Name : "+ "Menu Driven Calculator.");
		System.out.println("----------* Write  functions for arithmatic operators *---------");
		menu();
	}
	
	public static void confirm()
	{
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("\nDo you want to continue? \n1.Yes.\n2.No.");
		System.out.println("Please specify the choice : 1 Or 2 : ");
		choice=input.nextInt();
		switch(choice)
		{
		case 1: menu();
				break;
		case 2: System.out.println("You have closed your program.\nPlease Re-run the program for arithmatic operations.");
				break;
		default:System.out.println("You have entered incorrect Choice.Your Choice must be either 1 Or 2 only.");
				confirm();
				break;
		}
	}
	
	public static void menu()
	{
		System.out.println("\n*********** Menu ***********\n1.Addition.\n2.Subtraction.\n3.Multiplication.\n4.Division.\n5.Molulus.");
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice : ");
		choice=input.nextInt();
		if (choice >= 1 && choice <=5)
		{
				if(choice==1)
				{
					System.out.println("You want to perform Addition opeartion.");
				}
				if(choice==2)
				{
					System.out.println("You want to perform Subtraction opeartion.");
				}
				if(choice==3)
				{
					System.out.println("You want to perform Multiplication opeartion.");
				}
				if(choice==4)
				{
					System.out.println("You want to perform Division opeartion.");
				}
				if(choice==5)
				{
					System.out.println("You want to perform Modulus opeartion.");
				}
				
				int first_number,second_number;
				System.out.println("Enter Value of First Number: ");
				first_number=input.nextInt();
				System.out.println("Enter Value of Second Number: ");
				second_number=input.nextInt();
			switch(choice)
			{
				case 1:addition(first_number,second_number);
						confirm();
						break;
				case 2:sub(first_number,second_number);
						confirm();
						break;
				case 3:mul(first_number,second_number);
						confirm();
						break;
				case 4:div(first_number,second_number);
						confirm();
						break;
				case 5:modul(first_number,second_number);
						confirm();
						break;
//				default: System.out.println("You have entered incorrect value.");
//						confirm();
//						break;
			}
		}
		else
		{
			System.out.println("You have entered incorrect Choice.You must enter choice between 1 to 5 only..");
			confirm();
		}
	}
	
	public static int addition(int a, int b)
	{
	
		int sum=a+b;
		System.out.println("Addition is : "+sum);
		return sum;
	}
	
	public static int sub(int a, int b)
	{
	
		int sub=a-b;
		System.out.println("Subtraction is : "+sub);
		return sub;
	}
	
	public static int mul(int a, int b)
	{
	
		int multi=a*b;
		System.out.println("Multiplication is : "+multi);
		return multi;
	}
	
	public static int div(int a, int b)
	{
		if(b==0)
		{
			System.out.println("Number cannot be divided by 0.");
			return 0;
		}
		else
		{
			int division=a/b;
			System.out.println("Division is : "+division);
			return division;
		}
		
	}
	
	public static int modul(int a,int b)
	{
		int mod=a%b;
		System.out.println("Reminder is : "+mod);
		return mod;
	}
}
