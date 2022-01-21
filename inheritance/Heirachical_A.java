package inheritance;

class Heirachical_C
{
	void disp()
	{
		System.out.println("Heirachical inheritance-- Parent class");
	}
}
class Heirachical_B extends Heirachical_C
{
	void disp1()
	{
		System.out.println("Heirachical inheritance-- child class--Heirachical1");
	}
}
public class Heirachical_A extends Heirachical_C {

	void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args) {
	
		Heirachical_A obj= new Heirachical_A();
		Heirachical_B obj1= new Heirachical_B();
		obj1.disp();
		obj1.disp1();
		obj.test();

	}

}
