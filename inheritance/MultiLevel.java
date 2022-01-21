package inheritance;

class B
{
	void multi()
	{
		System.out.println("B class");
	}
}
class A extends B
{
	void display()
	{
		System.out.println("MulitLevel  inheritance");
	}
}

public class MultiLevel extends A{ // extends used to inherit the parent class proerty in child class

	
	public static void main(String[] args) {
		
		MultiLevel obj=new MultiLevel();
		obj.display();
		obj.multi();//child class object can able to access parent class data member
	}

}


