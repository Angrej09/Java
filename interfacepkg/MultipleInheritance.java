package interfacepkg;


interface A1
{
	void disp();
}

interface B1 
{
	void test();
}

public class MultipleInheritance implements A1,B1 {

	
	@Override
	public void test() {
		System.out.println("calling  test ");
		
	}

	@Override
	public void disp() {
		System.out.println("calling  disp ");
		
	}
	
	}

	class Sample
	
	{
		public static void main(String[] args) {
			
			MultipleInheritance m= new MultipleInheritance();
			m.disp();
			m.test();
			
			A1 a1 =new MultipleInheritance();//upcasting
			a1.disp();
			
			B1 b1 =new MultipleInheritance();//upcasting
			b1.test();
			
			
	}

}
