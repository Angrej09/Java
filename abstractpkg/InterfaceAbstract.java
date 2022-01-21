package abstractpkg;
 interface I1
 {
	 int i=10;  
	 void disp();
	 void test1();
 }
 abstract class A1
 {
	 private static final int i=10; 
	 abstract void test();
	  abstract void hello();
	  
 }
 class C1 
 {


	 
 }
 class C2 extends A1
 {

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void hello() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 
 class C3 extends C2
 {

	

	
	 
 }
public class InterfaceAbstract implements I1 {

	public static void main(String[] args) {
		System.out.println("Test");
	}

	

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

}
