package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) throws IOException 
	{
		//Reading content from one file and writting it into another file.
		
		//for Reading 
		FileReader fr=null;
		fr=new FileReader("C:\\Users\\Avinash\\Documents\\API Class\\FileForReading.txt");
		BufferedReader reader=new BufferedReader(fr);
		
		//for Writting
		FileWriter fw=new FileWriter("C:\\Users\\Avinash\\Documents\\API Class\\FileForWritting.txt");//locate file
		BufferedWriter bw=new BufferedWriter(fw);
		
		String line=null;		
		
		while((line=reader.readLine())!=null)
		{
			bw.write(line);
			bw.write("\n");
			bw.newLine();
			System.out.println(line);

			bw.flush();

		}
			reader.close();
			
//			FileUtils.copyfiles();//need to download and add jar common-io-2.6

	}

}
