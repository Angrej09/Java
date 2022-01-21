package inheritance;

class Test
{
	void display()
	{
		System.out.println("Single level inheritance");
	}
}

public class SingleLevel extends Test{ // extends used to inherit the parent class proerty in child class

	public static void main(String[] args) {
		
		SingleLevel obj=new SingleLevel();
		obj.display();//child class object can able to access parent class data member
	}

}
