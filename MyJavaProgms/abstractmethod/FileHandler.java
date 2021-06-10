//package com.probity.erp;
package abstractmethod;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	public static void main(String[] args) throws IOException {
		// Opens a file in read mode
		FileReader fr = new FileReader("C:\\Users\\Avinash\\Documents\\API Class\\Person.txt");
		BufferedReader br = new BufferedReader(fr);
		String stringLine = null;

		Person p = new Person();
		
		while ((stringLine = br.readLine()) != null) // Reading Content from the file
		{
			String value[] = stringLine.split(":");

			int returnResult = returnString(stringLine); //Not getting what this line will do?
			
			switch(returnResult) {
			case 1:
				p.name = value[1].replace(",", "");
				break;
			case 2:
				p.contact = Long.parseLong(value[1].replace(",", "").trim());//Also what is the purpose of this line?
				break;
			case 3:
				p.age = Integer.parseInt(value[1].replace(",", "").trim());
				break;
			case 4:
				p.addreess = value[1].replace(",", "");
				break;
			case 5:
				p.emp_id = Long.parseLong(value[1].replace(",", "").trim());
				break;
			case 6:
				p.salary = Double.parseDouble(value[1].replace(",", "").trim());
				break;
			case 7:
				p.height = Integer.parseInt(value[1].replace(",", "").trim());
				break;
			case 8:
				p.weight = Double.parseDouble(value[1].replace(",", "").trim());
				break;
			default:
//				System.out.println("Some thing went wrong !!!!");
				break;
			}
		}
		
		System.out.println(p.toString());
		
		fr.close();
	}

	private static int returnString(String stringLine) {
		int returnResult = 0;
		
		if(stringLine.contains("name")) {
			returnResult = 1;
		}
		if(stringLine.contains("contact")) {
			returnResult = 2;
		}
		if(stringLine.contains("age")) {
			returnResult = 3;
		}
		if(stringLine.contains("addreess")) {
			returnResult = 4;
		}
		if(stringLine.contains("emp_id")) {
			returnResult = 5;
		}
		if(stringLine.contains("salary")) {
			returnResult = 6;
		}
		if(stringLine.contains("height")) {
			returnResult = 7;
		}
		if(stringLine.contains("weight")) {
			returnResult = 8;
		}
		
		return returnResult;
	}
	
}
