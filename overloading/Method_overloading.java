package overloading;

/**Method Overloading - Whenever we want to perform same operation 
but with different inputs we go for Method Overloading

Developing Multiple methods with same 'name' 
but variation in 'argument list' - data type and length of data type
complile time polymorphism- static binding
*/

public class Method_overloading {
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

	Method_overloading p = new Method_overloading();
	p.test();
	p.test(10);
	p.test(10.5, "abc");


}

}

