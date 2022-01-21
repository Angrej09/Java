package methods;

class Test
{
	int id=100;
	static String name="Angrej";
	void disp() 
	{
		System.out.println("from Test class-- disp -non static method");
		
	}
	static void hello() 
	{
		System.out.println("from Test class-- hello -static method");
	}
}

public class MultipleClass_Nonstatic2static {

	void display()
	{
		//new Test().disp();
		//Test.disp();
		
		Test.hello();
		System.out.println("from MultipleClass_Nonstatic2static class-- display -non static method");
	}
	
	public static void main(String[] args) {
		System.out.println(new Test().id);
		new Test().disp();
		
		System.out.println(Test.name);
		Test.hello();
		
		new MultipleClass_Nonstatic2static().display();

	}

}
