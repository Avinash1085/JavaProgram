
public class silverSavingAcc extends SavingAccount 
{
	String offerId;
	void siverinput()
	{
		System.out.println("Enter Offer Id : ");
		offerId=sc.next();
	}
	void showSilverDetails()
	{
		System.out.println("SilverOffer Id is : "+offerId);
	}

	public static void main(String[] args) 
	{
		silverSavingAcc ss=new silverSavingAcc();
		//ss.input();
		//ss.inputSavingDetail();
		//ss.show();
		//ss.showSavingDetails();
		SavingAccount.main(null);//this will call all methods of savingavounts and Account class.
		ss.siverinput();
		ss.showSilverDetails();

		//you can comment SavingAccount object and uncoment above commented lines to call all methods
		//Example of Multilevel inheritance

	}

}
