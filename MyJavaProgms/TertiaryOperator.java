
public class TertiaryOperator {

	public static void main(String[] args) 
	{

		int age=19;
		String beverage=(age>=21)?"Beer":"Juice";
		System.out.println("You are eligible to take '"+beverage+"'.");
		
		int num=2;
		String result=(num%2==0)?" is even Number.":" is Odd Number.";
		System.out.println(num+result);
		
		
		int x=90;  
		int y=89;  
		int z=96;  
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
		System.out.println("The largest numbers is:  "+largestNumber); 
		
		int smallestNumber= (x < y) ? (x < z ? x : z) : (y < z ? y : z);  
		System.out.println("The smallest numbers is:  "+smallestNumber); 
		
	}

}
