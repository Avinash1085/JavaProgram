package abstractmethod;

public class ClassB extends ClassA 
{
	ClassB()
	{
		super();
		System.out.println("Constructor invoked in B Class");
	}
	
	public static void main(String[] args) 
	{
		ClassB b=new ClassB();
		b.m1();
		b.m3();
		m2();
		// TODO Auto-generated method stub

	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3 called from Class B");
	}

}
