package abstractpkg;
//final : final key word 
//final class can not be inherited 
//final method can not be over ridden 
//final variable : value can not be changed
//abstract final class Test1--- abstract can't be final-
//abstract static class Test1-- abstract class can't be static 
 abstract class Test1
{
	final   int i=10;//possible
	   int j=20;//possible
	//abstract final void disp(); //abstract method can't be final
	// abstract static void disp();-- also can'e be static method
	//private abstract void disp();-- not possible to create with private
	public abstract void disp();// possible
	protected abstract  void test();// possible
	abstract void view();//possible
	
	
}
public class AbstractTest extends Test1{

	 void hello()
	 {
		 System.out.println("hello");
	 }
		 	
	 
	public static void main(String[] args) {
		
		AbstractTest a=new AbstractTest();
		int i=30;
		System.out.println(i);
		System.out.println(a.i);
		System.out.println(a.j);
		a.disp();
		a.test();
		a.view();
		a.hello();//- can be accessible
		
		//upcasting
		Test1 t=new AbstractTest();// object can be created and store in abstract class reference
		t.disp();
		t.view();
		t.test();
		//t.hello();- can't be accessible- only parent class method

	}

	@Override
	public void disp() {
	System.out.println("disp mehtod");
		
	}

	@Override
	protected void test() {
		System.out.println("test mehtod");
		
	}

	@Override
	void view() {
		System.out.println("view mehtod");
		
	}

}
