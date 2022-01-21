package methods;

class A{
	 
	static int i=200;
	static void test()
	{
		System.out.println("from StaticClass");
	}
}

	class StaticClass{
	 static int a=10;
	static char c='a';
	static void test()
	{
		int t=A.i; //
		System.out.println("from StaticClass");
		System.out.println("printing varaible of class A " +t);
	}
}

public class StaticClassMain {

		static String name="Angrej";
		static boolean b=false;
		
		static void test1()
		{
			System.out.println("from StaticClassMain");
		}
		public static void main(String[] args) {
			
			test1();
			System.out.println(b);
			StaticClass.test();
			System.out.println(StaticClass.a);
			System.out.println(StaticClass.c);
			
			
	}

}
