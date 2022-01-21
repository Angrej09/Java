package typecasting;
/**Converting superclass type into subclass object is called as Downcasting
	When you downcast we can access both superclass properties as well as subclass properties

NOTE: Only upcasted objects can be downcasted
	Without upcasting if we try to downcast then we will get runtime exception
	*/
class Test1
{
	void test()
	{
		System.out.println("parent class");
	}
}

public class Downcasting extends Test1
{  	
	void disp()
	{
		System.out.println("child class");
	}
	
	/*void test()
	{
		System.out.println("child test class");
	}*/

	public static void main(String[] args)    // main method overloading
	{
		
		/*Downcasting downcast=(Downcasting) new Test1();
		downcast.disp();
		downcast.test();*/
		
		
		System.out.println("*****UPCASTING******");	
		Test1 t = new Downcasting();  // UPCASTING
		t.test();  // superclass/parent  properties only
		System.out.println("******DOWNCASTING*****");
		Downcasting p	=(Downcasting)t ; //DOWNCASTING
		p.disp();// can able to access child/subclass property
		p.test();// can able to access child/subclass property
		
	
		
	}
}