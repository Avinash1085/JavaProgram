package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeImplementation {
	static List<Employee> empList;
	public static void main(String[] args) throws IOException
	{
		empList=new ArrayList<Employee>();
		Scanner scan=new Scanner(System.in);
		ObjectMapper mapper=new ObjectMapper();
		int eno=0,age=0;
		double contact=0;
		String name=null,desig = null;
		Employee e1=new Employee(2,"Shree",33,"QA",99870); //for my practice added parameterized constructor
		empList.add(e1);
		System.out.println(empList.toString());

		Employee e=new Employee();
		e.setAge(31);
		e.seteNo(1);
		e.setContact(997501084);
		e.setDesignation("Sr.Test Engineer");
		e.setName("Avinash");
		
		int age1=e.getAge();
		System.out.println("Age is : "+age1);
		//serialization  : meaning take a object of class and make file out of that object.
		
		String EmpJson=mapper.writeValueAsString(e);
		System.out.println(EmpJson);
		
		
		//De-serialization : meaning take a file and make a object of it using class pojo objects ensure that file fields and class variables should same is case and names.
		Employee emp=mapper.readValue(new File("C:\\Users\\Avinash\\Documents\\API Class\\Employee.json"), Employee.class);
		System.out.println(emp);
		
		
//		System.out.println(empList.toString());
//		empList.add(e1);
//		empList.add(addEmp());
//		empList.add(addEmp());
	}


}
