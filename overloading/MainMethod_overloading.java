package overloading;

//Advantages
//User readability will be good
//easy to remember method names
//there will be consistency in method names
//we can achieve compile time polymorphism

//Note - What all methods we can overload ?
//Static , Non Static and Main method



public class MainMethod_overloading
{  	
	public static void main()
	{
		System.out.println("hi");
	}
	
	public static void main(int a)
	{
		System.out.println("bye");
	}
	public static void main(String[] args , int b)
	{
		System.out.println("bye");
	}

	public static void main(String[] args)    // main method overloading
	{
		System.out.println("test");

		main();
		main(10);
		//main("shashank", 10);
	}

}

