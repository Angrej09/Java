package methods;

public class SIB_IIB {
	
	static int i=20; //static is prefereable
	float f=10f;
	 static void add()
	 {
		System.out.println("static add method"); 
	 }
	 
	 void sub()
	 {
		 System.out.println("non static method");
	 }
	static
	{
		
		System.out.println("Static block" +i);
	}
	static
	{
		System.out.println("Static block--1");
	}
	
	{
		System.out.println("Non Static block");
	}
	{
		System.out.println("Non Static block--1");
	}
	public static void main(String[] args) {
		
		SIB_IIB obj=	 new SIB_IIB();
		
		System.out.println(i);
		add();
		obj.sub();
		//float ft=obj.f;
		System.out.println(obj.f);
		System.out.println();
		 System.out.println("in main mehtod");
	}

}
