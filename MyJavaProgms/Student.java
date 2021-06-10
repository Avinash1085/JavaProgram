
public class Student {
	int RollNo;
	String StudName;
	public static void main(String[] args) 
	{
		Student stud1=new Student(101,"Avinash");
		Student stud2=new Student(102,"Amit");
		Student stud3=new Student();
		stud1.show();
		stud2.show();
		stud3.show();

	}
	void show()
	{
		System.out.println("Roll Number is : "+RollNo);
		System.out.println("Name of Student is : "+StudName);
	}
Student()
{
	RollNo=1;
	StudName="Pooja";
}
Student(int RNo,String Sname)
{
	RollNo=RNo;
	StudName=Sname;
}
}
