package FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.Buffer;
public class FileProgram {
//FileReader will locate the file on your disk
//	BufferReader will take file into RAM
	public static void main(String[] args) throws IOException
	{
		readFile();
		FileReader fr=null;
		int count=0;

		fr=new FileReader("C:\\Users\\Avinash\\Documents\\API Class\\FileForReading.txt");
	

		BufferedReader reader=new BufferedReader(fr);
		String line=null;
		
		while((line=reader.readLine())!=null)
		{
			count++;
			System.out.println(line);
		}
		System.out.println(count);
	reader.close();
	}
//creating method for reading file
	public static void readFile() throws IOException
	{
		System.out.println("Reading the same file with specific function and calling this function in main.\nSo that no need to write code of line in main which are currently written. \nSo you just need to call readFile() finction in main function.");
		FileReader fr1=null;

		fr1=new FileReader("C:\\Users\\Avinash\\Documents\\API Class\\FileForReading.txt");
	

		BufferedReader reader1=new BufferedReader(fr1);
		String line1=null;
		
		while((line1=reader1.readLine())!=null)
		{
			System.out.println(line1);
		}
		reader1.close();
	}
}
