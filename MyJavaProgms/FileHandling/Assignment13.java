package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment13 {

	public static void main(String[] args) throws IOException 
	{
		//Program to read file and find how many lines,words and occurances of given word are there in file
		readFile();
	}

	public static void readFile() throws IOException
	{
		int noOfLines=0;
		int noOfWords=0;
		int noOfJavaWords=0;
		FileReader fr=null;
		fr=new FileReader("C:\\Users\\Avinash\\Documents\\API Class\\FileForReading.txt");
	
		BufferedReader reader=new BufferedReader(fr);
		String line=null;
		String wordArray[]=null;
		
		while((line=reader.readLine())!=null)
		{
			noOfLines++;
			System.out.println(line);
//			System.out.println(line.length());
			wordArray=line.split(" ");
			noOfWords=noOfWords+wordArray.length;//counting words in file
			for (int i=0;i<wordArray.length;i++)
			{
				if	(
						wordArray[i].equalsIgnoreCase("Java")|| wordArray[i].equalsIgnoreCase("Java.")
						
						||wordArray[i].equalsIgnoreCase("Java,")||wordArray[i].equalsIgnoreCase("#Java")
						
						||wordArray[i].contains("Java")||wordArray[i].contains("java") 
					)
				{
					noOfJavaWords++;
				}
//				System.out.println(wordArray[i]);

			}
		}

		System.out.println("Number of Lines inside the file are : "+noOfLines);
        
		System.out.println("Number of words inside the file are : "+noOfWords);
		System.out.println("Number of 'Java' words inside the file are : "+noOfJavaWords);

		reader.close();
	}

}
