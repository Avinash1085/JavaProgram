import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PersonImplementation {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Avinash\\Documents\\API Class\\Person.json");
		BufferedReader reader = new BufferedReader(fr);
		String line = null;

		Person person = new Person();
		
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			
			if(line.contains("name")) {
				String[] value = line.split(":");
				person.name = value[1];
				
			}
			
			if(line.contains("contact")) {
				String[] value = line.split(":");
				person.contact = value[1];
				
			}
			
			if(line.contains("age")) {
				String[] value = line.split(":");
				person.age = value[1];
				
			}
			
			if(line.contains("address")) {
				String[] value = line.split(":");
				person.address = value[1];
				
			}
			
			if(line.contains("Emp_id")) {
				String[] value = line.split(":");
				person.emp_Id = value[1];
				
			}
			
			if(line.contains("Salary")) {
				String[] value = line.split(":");
				person.salary = value[1];
				
			}
			
			if(line.contains("Height")) {
				String[] value = line.split(":");
				person.height = value[1];
			
			}
			
			if(line.contains("Weight")) {
				String[] value = line.split(":");
				person.weight = value[1];
				
			}
		}
		System.out.println("name is : " + person.name);
		System.out.println("contact is : " + person.contact);
		System.out.println("age is : " + person.age);
		System.out.println("address is : " + person.address);
		System.out.println("emp_Id is : " + person.emp_Id);
		System.out.println("salary is : " + person.salary);
		System.out.println("height is : " + person.height);
		System.out.println("weight is : " + person.weight);
		System.out.println("Json file values are: " + person.toString());
	}
	
	

}