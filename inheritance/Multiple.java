package inheritance;

class Engine
{
	void disp()
	{
		System.out.println("Engine displyed");
	}
}
class Tyre
{
	void disp()
	{
		System.out.println("Tyre displyed");
	}
}

class Bike extends Engine
{
	void bike()
	{
		System.out.println("Bike Engine");
	}
}

/*class Bike extends Tyre
{
	void bike()
	{
		System.out.println("Bike Engine");
	}
}*/
public class Multiple extends Tyre {

	public static void main(String[] args) {
		

	}

}
