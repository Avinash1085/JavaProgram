package abstractmethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import FileHandling.Employee;

public class EmpAssignment18 
{
	int e_No,age;
	double contact;
	String name,designation;
	
	static Scanner scan=new Scanner(System.in);
	
	static List<EmpAssignment18> empList=new ArrayList<EmpAssignment18>();
	static Employee e=null;
	
	public static void Menu()
	{
		System.out.println("1.Add Employee.\n2.Search Employee.\n3.Delete Employee.\n4.Show AllEmployee.\n5.Exit");
		
		System.out.println("Enter Your Choice : ");
		int ch=scan.nextInt();
		switch(ch)
		{
		case 1: addEmp();
				continue1();
				break;
		case 2:System.out.println("Enter Emp_id to Search : ");
			int no=scan.nextInt();
			searchEmp(no);
			continue1();
				break;
		case 3:System.out.println("Enter Emp_id to Delete : ");
				no=scan.nextInt();
				deleteEmp( no);
				continue1();
				break;

		case 4:displayEmp();
				continue1();		
//		case 5:exit();
		}
	}


	public static EmpAssignment18 addEmp()
	{
		Scanner scan=new Scanner(System.in);
		int no=0;
		EmpAssignment18 e2=new EmpAssignment18();
//			 System.out.println("Enter Emp No : ");
//			 e2.setE_No(scan.nextInt());
			 no=e2.setE_No(empList.size()+1);
			 System.out.println("Enter Emp Name : ");
			 String name=e2.setName(scan.next());;

			 System.out.println("Enter Emp Age : ");
			 int age=e2.setAge(scan.nextInt());

			 System.out.println("Enter Emp designation : ");
			 String design=e2.setDesignation(scan.next());;
			 
			 System.out.println("Enter Emp Contact : ");
			 double contact=e2.setContact(scan.nextDouble());;
			 System.out.println("Record added successfully...!!");
			 
			 empList.add(e2);
			 System.out.println("Inserted Record : ");//+empList.toString());
			 System.out.println("E_no : "+no+" ,Name : "+name+", Age : "+age+", Designation : "+design+", Contact : "+contact);

			return e2;
	}		

	public static void displayEmp()
	{
		EmpAssignment18 e1=null;
		for(EmpAssignment18 e : empList)
		{
			e1=e;
			e.getAge();
			e.getE_No();
			e.getName();
			e.getContact();
			e.getDesignation();
			System.out.println(" Emp_No : "+e1.getE_No()+", Emp_Name : "+e.getName()+", Age : "+e.getAge()+", Designation : "+e.getDesignation()+", Contact : "+e.getContact());
		}
//		return null;
	}
	public static EmpAssignment18 searchEmp(int no)
	{
		EmpAssignment18 e2=new EmpAssignment18();
	
//		System.out.println("Enter Emp_id to Search : ");
//		no=scan.nextInt();
		if(empList!=null && !empList.isEmpty() && empList.size()>0)
		{
		for(EmpAssignment18 emp:empList)
		{
			e2=emp;
			if(e2.getE_No()==no)
			{
//				System.out.println("Emp_No : "+e2.getE_No()+", Emp_Name : "+e2.getName()+", Emp_Age : "+e2.getAge()+", Emp_Designation : "+e2.getDesignation()+", Emp_Contact : "+e2.getContact());
				System.out.println(emp.toString());//this is also working.
				break;
			}
			else
			{
				System.out.println("Record not Found !!");
			}
		}
		}
		else
		{
			System.out.println("No Record Found...");
		}
		return e2;
	}
	public static void continue1()
	{
		System.out.println("Do you want to Continue ? \n1.Yes.\n2.No");
		int ch=scan.nextInt();
		switch(ch)
		{
		case 1: Menu();
		}
	}
	
	public static EmpAssignment18 deleteEmp(int no)
	{
		EmpAssignment18 e2=new EmpAssignment18();
	
//		System.out.println("Enter Emp_id to Search : ");
//		no=scan.nextInt();
		if(empList!=null && !empList.isEmpty() && empList.size()>0)
		{
		for(EmpAssignment18 emp:empList)
		{
			e2=emp;
			if(e2.getE_No()==no)
			{
//				System.out.println("Emp_No : "+e2.getE_No()+", Emp_Name : "+e2.getName()+", Emp_Age : "+e2.getAge()+", Emp_Designation : "+e2.getDesignation()+", Emp_Contact : "+e2.getContact());
				System.out.println("This Record will be Deleted :- " +emp.toString());//this is also working.
				empList.remove(no);
//				e2.deleteEmp(no);
				break;
			}
			else
			{
				System.out.println("Record not Found !!");
			}
			System.out.println("After Deleting the Record Details Present are:"+empList.toString());

		}
		}
		else
		{
			System.out.println("No Record Found...");
		}
		return e2;
	}

	@Override
	public String toString() {
		return "EmpAssignment18 [e_No=" + e_No + ", name= " + name+ ", designation=" + designation + ", age=" + age + ", contact=" + contact + "]";
	}


	public int getE_No() {
		return e_No;
	}


	public int setE_No(int e_No) {
		this.e_No = e_No;
		return e_No;
	}


	public int getAge() {
		return age;
	}


	public int setAge(int age) {
		return this.age = age;
	}


	public double getContact() {
		return contact;
	}


	public double setContact(double contact) {
		return this.contact = contact;
	}


	public String getName() {
		return name;
	}


	public String setName(String name) {
		return this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public String setDesignation(String designation) {
		return this.designation = designation;
	}


	
}
