package FileHandling;

import java.util.ArrayList;
import java.util.List;

public class Assignment15 {

	public static void main(String[] args) 
	{
		List<Integer> list1= new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(40);
//		list1.add(30);
		
		List<Integer> list2= new ArrayList<>();
		list2.add(list1.get(2));  //this way is also possible to add element.
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		System.out.println("Elements of List 2 : ");
//		System.out.println(list1);
		for (int num :list1)//for each loop
		{
			System.out.println(num);
		}
		
		System.out.println("Elements of List 2 : ");
		for (int i=0;i<list2.size();i++)//for loop
		{
			System.out.println(list2.get(i));
		}
		int no=0;
		if(list1.size()==list2.size())
		{
			

			if(list1.containsAll(list2) && list2.containsAll(list1)) //working
//			if(list1.equals(list2))  //working
			{
				System.out.println("Both are equal");
			}
			else 
				System.out.println("Both Not Equal");
		}
	
		else
		{
			System.out.println("Not Equal");
		}

	}
	
}
