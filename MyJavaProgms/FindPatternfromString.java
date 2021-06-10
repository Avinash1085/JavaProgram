
public class FindPatternfromString 
{

	public static void main(String[] args) 
	{
		int count=0;
		String name="abaabbaaabbaabbaaabbbbababababababbbaab";
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
		 System.out.println(name);
		 System.out.println("Occurances of 'ab' in string are : "+count );
		 
//		 String s="affllssddlllsddldsdsd";
//		 String s1="ds";
//		 int len=s1.length();
//		 String s2=null;
//		 int li=s.lastIndexOf("d");
//		 int i=0,count1=0;
//		 while(len<li && i<s.length())
//		 {
////		 for(int i=0;i<s.length();i++)
////		 	{
//			
//			 		s2=s.substring(i, len);
//			 		if(s2.equals(s1))
//			 		{
//			 			count1++;
//			 			i++;
//			 			len++;
//			 		}
////			 }
//		 }
//		 System.out.println("Occurances of "+s1+" in given string are : "+count1);
//		 System.out.println(li);
	}

}
