package constructor;

public class Contructor_Overloading {

	/** Constructor overloading - Developing multiple constucrtors in the same class but variation in the argument list. 
	variation includes - 
				variation of data types
			 	variation of length of data types
				order of occurrences of data types

	  this() - this calling statement- should be read as this calling statement
	  whenever developer has developed multiple constructors within a class and if you want to call one constructor to 
	 another we go for this calling statement - it should be the first statement in the constructor
	Constructor chaining - one constructor calling another constructor is called constructor chaining
		*/

	 Contructor_Overloading(int a , int b , int c , char d )
		{
			this(1.5);//constuctor chaing 
			System.out.println("hello");
		}
		
	Contructor_Overloading(char d , int a , int b , int c)
		{
			this(10 , 20 , 30 , 'c');
			System.out.println("see you");
		}
		
	Contructor_Overloading(double b)
		{
			
			System.out.println("hi");
		}
		
	Contructor_Overloading(int a , int b , char d)
		{
			this('a' , 1 , 2 , 3);
			System.out.println("bye");
		}
		
		
		public static void main(String[] args)
		{
			new Contructor_Overloading(2 , 3 , 't');
			new Contructor_Overloading(1.5);
		
		}
				
}
