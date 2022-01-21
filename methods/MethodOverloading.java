package methods;


//Method Overloading - Whenever we want to perform same operation but with different inputs we go for Method Overloading

//Developing Multiple methods with same 'name' but variation in 'argument list' - data type and length of data type

public class MethodOverloading {
int test()
{
	System.out.println("hello");
	return 0;
}
/*void test()
{
	System.out.println("hello");
	
}*/
void test(int a)
{
	System.out.println("test 123 " +a);
}
void test(double a , String s)
{
	System.out.println(" 123 " +a +" "+ s);
}

static void test(char c , int q)
{
	System.out.println("static method");
}

public static void main(String[] args)
{
	
//	String s = "shashank";
//	s.substring(beginIndex);  // overloaded methods
//	s.substring(beginIndex, endIndex);  // overloaded methods

	MethodOverloading p = new MethodOverloading();
	p.test();
	p.test(10);
	p.test(10.5, "abc");


}

}
