package abstractmethod;
//interfaces behaves similar to abstratct classes.
public class SampleimplentsPrintable implements printable{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SampleimplentsPrintable s=new SampleimplentsPrintable();
		s.print();
		System.out.println(data);

	}

	@Override // like abstract class we need to add abstracted method from interface as well if class is implementing interface.
	public void print() 
	{
		// TODO Auto-generated method stub
		System.out.println("Printing from class sample");
		System.out.println("Printing data from interface : "+data);
	}

}
