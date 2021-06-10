package FileHandling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Assignment19 {

	static List<Integer> numList;
	static Set<Integer> numSet;
	static List<Integer> setList;
	int n=0;
	static int cnt=0;
	static int t=0, b=0;;
	
	public static void addElementToList()
	{
		int limit=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter limit for ArrayList : \n");
		limit=scan.nextInt();
		numList=new ArrayList<>(limit);

		for(int i=0;i<limit;i++)
		{
			if(i==0 || i==20 || i==30 || i==40 || i==50)
			{
			System.out.println("Enter "+(i+1)+"st Element to add in List: \n");
//			int ele=scan.nextInt();
//			numList.add(ele);

			onlyIntValue();
			numList.add(b);
			}
			if(i==1 || i==21 || i==31 || i==41 || i==51)
			{
			System.out.println("Enter "+(i+1)+"nd Element to add in List: \n");
//			int ele=scan.nextInt();
//			numList.add(ele);
			onlyIntValue();
			numList.add(b);
			}
			if(i==2 || i==22 ||i==32 || i==42)
			{
			System.out.println("Enter "+(i+1)+"rd Element to add in List: \n");
//			int ele=scan.nextInt(); //this line & below line is working properly in this method wherever its written but commented.
//			numList.add(ele);//working properly
			onlyIntValue(); // calling to accept only integers
			numList.add(b);
			}
			if(i>=3 && i!=22 && i!=32 && i!=42 && i!=21 && i!=31 && i!=41 && i!=51 && i!=20 && i!=30 && i!=40 && i!=50)
			{
			System.out.println("Enter "+(i+1)+"th Element to add in List: \n");
//			int ele=scan.nextInt();
//			numList.add(ele);
			onlyIntValue();
			numList.add(b);
			}
		}
	}
	public static void showElementsOfList()
	{
		//printing ListElements using iterator interface
		System.out.println("Printed Using Iterator .");
		Iterator<Integer> it=numList.iterator();
		while(it.hasNext())
		{
			int no=it.next(); //assigned value to no variable which is taken as 'int' becasue value are integer in numList
			System.out.println("List elements are : "+no);
		}
	}
	public static void countOccuranceOfEachElementOfList()
	{
		//converting ArraList to Set, numSet is declared as Set
		numSet=new HashSet<>(numList);
		System.out.println("Elements of Set which are taken and converted from List to Set.");
		//For Each loop to print Set elements using For each because Set cannot have get method to use index in for loop.
		for(Integer val:numSet)
		{
			System.out.println(val);
		}
		
		//converting Set into List again so that it will not have duplicates now.
		setList=new ArrayList<>(numSet);
		System.out.println("Elements of List which are taken and converted into List from Set");
		
		//using for loop printing List elements which will be with duplicates as converted from set to list.
		for(int i=0;i<setList.size();i++)
		{
			System.out.println(setList.get(i));
		}
		
		System.out.println(numList); // will print original List elements in format of :[] e.g [10,20,2,9,10,1,2,1]
		
		//here I am counting the occurances of each element from original List
		// setList is Arraylist and having each element only once from original numList
		//by using setList which List in type but each element from original List is only once in it,So iteration is made easy on each element so no duplicate printing will happen.
		for(int i=0;i<setList.size();i++) 
		{
			t=setList.get(i);
				for(int j=0;j<numList.size();j++) //Original numList with duplicates present in it.
				{
					if(t==numList.get(j))
					{
						cnt++;
					}

				}
			System.out.println("Occurances of "+t+" in List are : "+cnt);
			cnt=0;
		}
	}
	
	public static void alternativeWaytoCountOccuranceHardCode()
	{
		//Alternate way to count occurances of elements present in list // hardcoding  //Not useful for dynamic list.
		int countOf10=0,countOf9=0,countOf1=0,countOf11=0,temp=0;
		System.out.println(numList);
		for(int i=0;i<numList.size();i++)
		{
			temp=numList.get(i);
			
			if(numList.get(i)==10)
			{
				countOf10++;
			}
			if(numList.get(i)==9)
			{
				countOf9++;
			}
			if(numList.get(i)==1)
			{
				countOf1++;
			}
			if(numList.get(i)==11)
			{
				countOf11++;
			}

			}
		System.out.println("Count of 10 : "+countOf10);
		System.out.println("Count of 9 : "+countOf9);
		System.out.println("Count of 1 : "+countOf1);
		System.out.println("Count of 11 : "+countOf11);
	}
	public static void addManuallyListelement()
	{
		//don't call this method in main if already method is called for dynamic input from user to put in list.
		numList.add(10);numList.add(1);numList.add(11);numList.add(2);
		numList.add(1);	numList.add(9);numList.add(1);numList.add(10);
		numList.add(9);numList.add(11);numList.add(1);numList.add(11);
		numList.add(10);numList.add(9);
	}
	
	//Logic applied:
	//Declared Integer type List to take multiple values including duplicates.
	//Then converted the List into Set so duplicates can be taken only once.
	//Then again converted Set into List so that while iterating on each element will be easy and only once at high level
	//in 1st for loop and in second for loop used original List which is having duplicated in it so by second for loop 
	//I can iterate over all elements of original list.
	//why I converted Set to List again? because to apply for-loop I could not find index of elements present in Set since Set is not having get() to take index.
	public static int onlyIntValue()
	{
		boolean flag;
		
        do
        {
        	try
        	{
                        Scanner sc1 = new Scanner(System.in);
//                        System.out.println("Enter value for B ");
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
