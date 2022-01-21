package typecasting;
/**Type Casting
Converting one class object into another class object is called as Class/Object type casting
Upcasting--
Converting subclass object to Super class type is Upcasting  - IS A compulsory

NOTE - Incase of Upcasting we can access only Superclass properties i.e. we cannot access subclass properties*/

class Test
{
	void test()
	{
		System.out.println("parent class");
	}
}
public class Upcasting extends Test
{  	
	void disp()
	{
		System.out.println("child class");
	}	
	public static void main(String[] args)    // main method overloading
	{
		Upcasting p = new Upcasting();
		p.disp();    // Normal IS A
		p.test();   // Normal IS A


		Test t = new Upcasting();  // UPCASTING
		t.test(); // can able to access only parent property 
		//t.disp() --------------------unable to ACCESS


		//		Test t1	 = new Test();
		//		t1.test(); // parent property




	}


}

