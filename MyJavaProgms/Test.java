
class currentAcc extends Account
{
	float transFee;
	void inputcurreDetails()
	{
		System.out.println("Enter Tansaction Fee: ");
		transFee=sc.nextFloat();		
	}
	void currShow()
	{
		System.out.println("Transaction Fee is : "+transFee);
	}
}

public class Test 
{

	public static void main(String[] args)
	{
		SavingAccount s=new SavingAccount();
		currentAcc c=new currentAcc();
		
		System.out.println("Enter Saving Account Details :");
		s.input();
		s.inputSavingDetail();
		
		System.out.println("Enter Current Account Details :");
		c.input();
		c.inputcurreDetails();
		
		System.out.println("Saving account details are : ");
		s.show();
		s.showSavingDetails();
		
		System.out.println("Current account details are : ");
		c.show();
		c.currShow();
		//Example of hierarchical inheritance

	}

}
