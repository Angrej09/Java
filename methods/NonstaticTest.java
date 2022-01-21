package methods;

public class NonstaticTest {

			static int b = 20 ; 
			static public void test() // non static method
			{
				System.out.println("static method");
			}
			
			
			int a = 10 ;  // non static variable
			
			public void disp() // non static method
			{
				System.out.println("non static method");
			}
			
			public static void main(String[] args)
			{
//				PracticeJava p =  new PracticeJava(); // object
//					p.disp();
					
				System.out.println(new NonstaticTest().a); 
					
				new NonstaticTest().disp() ; // one more way of calling

	}

}
