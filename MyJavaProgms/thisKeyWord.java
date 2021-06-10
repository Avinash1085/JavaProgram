
public class thisKeyWord {
	int i=20;
	public static void main(String[] args) 
	{
		//this keyword is used to refer the instance variable.
		thisKeyWord obj=new thisKeyWord();
		obj.m();
		
	}
	void m()
	{
		int i=60;
		System.out.println(i);
		System.out.println(this.i);
	

	}
}
