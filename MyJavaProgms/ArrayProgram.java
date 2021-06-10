
public class ArrayProgram
{

	public static void main(String[] args)
	{
		int [] NumberArray={0,1,0,1,0,1,0,1,0};
		int tempval=0;
		//for each loop , limitations is we can ot use decreamental condition but we can build our logic to overcome it
//		int count=0;
//		for (int num:Numbers)
//		{
//			
//			if(count<5)
//			{
//			System.out.println(num);
//			count ++;
//			}
//			else
//				break;
//		}
		int len=NumberArray.length;
		System.out.println("Ascending Order.");
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(NumberArray[i]>NumberArray[j])
				{
					tempval=NumberArray[i];
					NumberArray[i]=NumberArray[j];
					NumberArray[j]=tempval;
					
				}
			}
			
			System.out.println("At : "+i +"  "+ NumberArray[i]); //Working properly

		}
		System.out.println("Descending Order.");
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(NumberArray[i]<NumberArray[j])
				{
					tempval=NumberArray[i];
					NumberArray[i]=NumberArray[j];
					NumberArray[j]=tempval;
					
				}
			}
			System.out.println(NumberArray[i]);
		}
		System.out.println("New array Test Result");
		int arr[]=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Program to guess correct output. output should be guessed in correct sequence");
		int arr1[]=new int[4];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		try
		{
			arr1[4]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
		
}
