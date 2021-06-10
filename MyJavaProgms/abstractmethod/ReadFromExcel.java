package abstractmethod;
import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ReadFromExcel {

	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\Avinash\\Documents\\API Class\\Newman\\DataToReadInJavaPrgm.xls");
		
		FileInputStream inputStream=new FileInputStream(file);
		
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
		
		HSSFSheet sheet=wb.getSheet("sheet1");
		
		HSSFRow row=sheet.getRow(1);
		
		HSSFCell cell=row.getCell(2);
		
		String str=cell.getStringCellValue();
		
		System.out.println("The String present at Excelt Cell is : "+str);
	}

}
