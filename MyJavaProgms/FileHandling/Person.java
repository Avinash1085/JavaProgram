package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Person {
	String name;
	int contact;

	public static void main(String[] args) throws IOException 
	{
		Person p=new Person();
		FileReader fr=null;
		fr=new FileReader("C:\\Users\\Avinash\\Documents\\API Class\\JASON.txt");
		BufferedReader reader=new BufferedReader(fr);
		
		String line;
		String Value[];
		int [] contact1;
		while((line=reader.readLine())!=null)
		{
			Value=line.split(":");
//			contact1=line.split(":");
			for(int i=0;i<Value.length;i++)
			if(Value[i].contains("name"))
			{
				p.name=Value[i+1];
			}
/*		else if (contact1[i].contains("contact"))
			{
				p.contact=contact1[i+1];
			} 
			*/

		} 
		System.out.println(p.name);

		System.out.println(p.contact);
	}

}
