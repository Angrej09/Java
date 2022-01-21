package abstractpkg;


abstract class Test10
{
	abstract void disp();
	
}

abstract class Test11 extends Test10
{
	abstract void test();
 void disp() 
 {
	 System.out.println("disp method");
 }
	
}

public class AbstractTest3 extends Test11 {
	
	void test()
	{
		System.out.println("test mehtod");
	}

	public static void main(String[] args) {
		

	}

}
