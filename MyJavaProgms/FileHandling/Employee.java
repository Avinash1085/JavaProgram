package FileHandling;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {
	
//	@JsonIgnore
	int eNo,age;  //The Pojo elements and File Fields should match with other even Case also.
	double contact;
	String name,designation;
	

	public double getContact() {
		return (long) contact;
	}


	public void setContact(double contact) {
		this.contact = contact;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int geteNo() {
		return eNo;
	}


	public void seteNo(int eNo) {
		this.eNo = eNo;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpNo=" + eNo + ", Emp Age=" + age + ", Contact=" + contact + ", Name=" + name + ", Designation="
				+ designation + "]";
	}
	Employee(int eno,String name ,int age, String designation,double contact)
	{
		this.eNo=eno;
		this.name=name;
		this.age=age;
		this.designation=designation;
		this.contact=contact;
		System.out.println("Emp_No : "+eNo+" , Emp_Name : "+name+" , Age : "+age+" , Designation : "+designation+" , Contact : "+contact);
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/*
	public static Employee addEmp()
	{
		Scanner scan=new Scanner(System.in);
		Employee e2=new Employee();
		
		 System.out.println("Enter Emp No : ");
		 e2.setE_No(scan.nextInt());
//		 e2.setE_No(eno);
		 System.out.println("Enter Emp Name : ");
		 e2.setName(scan.next());;
//		 e2.setName(name);
		 System.out.println("Enter Emp Age : ");
		 e2.setAge(scan.nextInt());
//		 e2.setAge(age);
		 System.out.println("Enter Emp designation : ");
		 e2.setDesignation(scan.next());;
//		 e2.setDesignation(desig);
		 
		 System.out.println("Enter Emp Contact : ");
		 e2.setContact(scan.nextDouble());;
//		 e2.setContact(contact);
		return e2;
	} */

}
	
//	
	
//}
