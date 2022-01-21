/*Single class			
Static to Static || Static to Non Static || Non Static to Static ||Non Static Non Static
directly	     ||   directly			 ||	Object				 ||	Directly
*/

package methods;

public class StaticNonStaticAccess {
	
	static int a=10; //static global variable
	int b=20; //non static global variable
	
	static void staticmethod() // static method
	{
		System.out.println("static method");
		System.out.println(new StaticNonStaticAccess().b);//non static variable to static method --creating object
		System.out.println(a);//static variable to static method -- calling directly
	}
	void test() //Non static method
	{
		System.out.println("test");
		staticmethod();//static method to non static method -- calling directly
		System.out.println(b);//non static variable to non static method -- calling directly
	}
	void disp() //Non static method
	{
		System.out.println("disp");
		test();//Non static method to non static method -- calling directly
		System.out.println(a);// static variable to non static method -- calling directly
	}
	public static void main(String[] args) { //static method
		
		new StaticNonStaticAccess().disp();//Non static method to static method -- creating object
		staticmethod();//static method to static method -- calling directly
		System.out.println(a);//static variable to static method -- calling directly
	}
	
}

