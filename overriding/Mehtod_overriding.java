package overriding;

/**Method Overriding - Developing a method in the subclass 
as that in the superclass with same name and signature(arguments) but 
with different implementations is called as Method Overriding

Conditions
	method Name and Signature should be same
	IS A relationship should be there
	 Methods should be Non Static only

1. When we override we get present/overridden implementation.
2. Along with overridden implementation , if we want to previous implementation then we should use Super keyword
3. We CANNOT override main method , static methods

When we want new implementation we go for Method Overriding

Windows Update
Android Update 
*/


class Disp
{
	  void camera()
	{
		System.out.println("1.3 MP Camera");
		
	}
}

public class Mehtod_overriding extends Disp
{  	

	 void camera()
	{ 
		//super.camera();   // to get previous implementation
		System.out.println("oppo camera phone");
		
	}
	public static void main(String[] args)    // main method overloading
	{
		
		Disp test123=new Disp();
		test123.camera();
		Disp test=new Mehtod_overriding();//upcasting
		Mehtod_overriding test1=new Mehtod_overriding();
		test.camera();
		test1.camera();
		new Mehtod_overriding().camera();
		
		
	}


}
