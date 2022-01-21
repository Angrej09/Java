package abstractpkg;
//only concrete methods
abstract class Abstract1
{
	void hi1()
	{
		System.out.println("from hi concerete method");
	}
	void hello1()
	{
		System.out.println("from hello concerete method");
	}
}
//only abstract methods
abstract class Abstract2 extends Abstract1
{
	abstract void hi();
	abstract void hello();
}
//both concrete and abstract methods
abstract class Abstract3 extends Abstract1
{
	void hi()
	{
		System.out.println("concerete method 'hi' from abstract3 class");
	}
	void hello()
	{
		System.out.println("concerete method 'hello' from abstract3 class");
	}

	abstract void bye();
	abstract void tata();
}
public class Abstract extends Abstract3{
	@Override
	void bye() {
		System.out.println("abstract method 'bye' from abstract3 class");
		
	}

	@Override
	void tata() {
		System.out.println("abstract method 'tata' from abstract3 class");
		
	}
	public static void main(String[] args) {
		
		//new Abstract1();//can't create object for abstract class
		Abstract a=new Abstract();
		a.bye();
		a.tata();
		a.hi();
		a.hello();
		a.hi1();
		a.hello1();
	}



}
