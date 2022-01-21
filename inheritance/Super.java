package inheritance;

class Disp // Object is super class --- implicit extends Object  // B
{
	int i;
	Disp()
	{
		System.out.println("Disp class constructor without parameter ");
	}
	
	Disp(int a)
	{
		i=a;
		System.out.println("Disp class Constructor with parameter=" + a );
	}
	
}

  // super keyword - used to call superclass members

public class Super extends Disp 
{  
	
	Super()
	{
		
		//super();
		super(10);//Super is the first statement(super calling stment) and only once can be written to call parent class data members
		System.out.println(super.i);//super keyword used
		System.out.println("Super class constructor");
	}
	
	void tt()
	{
		System.out.println("Test super");
	}
		
	public static void main(String[] args)
	{
		
		
		 new Super();//invoking immediate parent class data members
		 
		 Super s=new Super();
		 s.tt();
		
		
	}


}





