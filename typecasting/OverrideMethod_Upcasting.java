package typecasting;

/** NOTE:- when method override then it will access ALWAYS overriden(child class) implementation*/
/** Polymorphism--/ Types
	 Compile Time Polymorphism   - CTP
	 Run Time Polymorphism  - RTP

 RTP - Method declaration gets binded to if definition at runtime by the JVM based on the object created. LateBinding/DynamicBinding
EXAMPLE - Method Overriding
 When a parent class reference variable points at child class object then the call to the overridden method is determined at runtime.
*/
class Test2
{
	void disp()
	{
		System.out.println("parent class--disp method");
	}
	void test()
	{
		System.out.println("parent class--test method");
	}
	void hello(int a)
	{
		System.out.println("parent class--hello method" +a);
	}
}
public class OverrideMethod_Upcasting extends Test2
{  	

	void disp()
	{
		super.test(); //to call parent calss property
		System.out.println("child class-- disp method");
	}
	void test()
	{
		super.hello(10);
		//super.disp();
		System.out.println("child class -- test method");
	}

	public static void main(String[] args)    // main method overloading
	{
		OverrideMethod_Upcasting p = new OverrideMethod_Upcasting();
		//p.disp();    // Normal IS A
		//p.test();   // Normal IS A

		Test2 t = new OverrideMethod_Upcasting();   // UPCASTING
		t.test(); /* can able to access only parent property 
					BUT in this case as test() is override 
					so it will give the priority to overriden method from child class
					this is Run Time polymorphism
		 			*/ 
		//t.disp();// overriden method access child class
		
	}
}


