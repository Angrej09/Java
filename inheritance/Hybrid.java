package inheritance;

class A1
{
	void test_A1()
	{
		System.out.println("test");
	}
}
class B1 extends A1
{
	void test_B1() 
	{
		System.out.println("test1-- single level");
	}
}
class C1 extends A1
{
	void test_C1()
	{
		System.out.println("test2-- multi level");
	}
}
public class Hybrid extends B1{
	
	void test_Hybrid()
	{
		System.out.println("test3-- heririchical");
	}

	public static void main(String[] args) {
	
		
		C1 c=new C1();//composition -- Has a relationship-- creating object for one class in another class
		c.test_C1();
		c.test_A1();//from class A1-- heirachical inheritance
		
		B1 b=new B1();
		b.test_B1();
		b.test_A1();//from class A1-- heirachical inheritance
		
		Hybrid h=new Hybrid();
		h.test_Hybrid();//non static to static creating object.
		h.test_B1();//from class B1--- single level inheritance
		h.test_A1();//from class A1-- multilevel inheritance
		
		
		
	}

}
