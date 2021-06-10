//import com.sun.java_cup.internal.runtime.Scanner;
import java.util.Scanner;
class Account
	{
		String accountId;
		double balance;
		Scanner sc=new Scanner(System.in);
		
		void input()
		{
			System.out.println("Enter Account Id : ");
			accountId=sc.next();
			System.out.println("Enter Account Balance : ");

			balance=sc.nextDouble();
		}
		void show()
		{
			System.out.println("Acount Id is : "+accountId);
			System.out.println("Account Balance is : "+balance );
		}
		
	}
	public class SavingAccount extends Account
	{
		float rateOfInt;
		void inputSavingDetail()
		{
			System.out.println("Enter Rate of Interest : ");
			rateOfInt=sc.nextFloat();
			
		}
		void showSavingDetails()
		{
			System.out.println("Rate of interst is : "+rateOfInt);
		}
	public static void main(String[] args) 
	{
		SavingAccount S=new SavingAccount();
		S.input();
		S.inputSavingDetail();
		S.show();
		S.showSavingDetails();
		//Example of single inheritance

	}

	}
