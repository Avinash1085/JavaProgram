import java.util.Arrays;

public class StringsProgram {

	public static void main(String[] args) 
	{
		int count=0;
		String name="aabbbabbabababababbaabbaaabababbaaaba";
		String newStr = null;
		
        //converted string to character array named a[]
		char a[]=name.toCharArray();
		
		String str=name.concat("123");
		System.out.println(str);
		char[] ch = new char[name.length()];
				  
        // Copy character by character into array
        for (int i = 0; i < name.length(); i++) 
        {
        	for(int j=i+1;j<name.length();j++)
        	{
                ch[i] = name.charAt(i);   
        	}        
        }
        // Printing content of array1
        System.out.println("Array 1");
        for (char c : ch) 
        {
            System.out.println(c);
        }
//aabbababbbaaa
        for(int i=0;i<name.length();i++)
        {
        	for(int j=i+1;j<=i+1;j++)
        	{
        		if(name.charAt(i)=='a' && name.charAt(j)=='b')
        		{
        			count++;
        		}
        			 
        	}
        	
        }
		 System.out.println("Occurances of 'ab' in string are : "+count );

	}
}
	

