package inheritance;


class DispA 
{
	
	 DispA()//Step5 will print the DispA contrcutor statement
	{
		System.out.println("DispA constructor");
	}
	
	void  disp()
	 {
		 System.out.println("disp method");
	 }
}

 class TestA extends DispA 
{ 
	
	 TestA()//Step3 will be call TestA contrcutor
		{
		//super();Step 4 -here Bydefault/hidden super() statement will call the parent class contrcutor DispA
			 System.out.println("TestA contrcutor");
		}
	 TestA(int a)//Step3 will be call TestA contrcutor
	{
	//super();Step 4 -here By default/hidden super() statement will call the parent class contrcutor DispA
		 System.out.println("TestA contrcutor");
	}
		
		void  test()
		 {
			 System.out.println("test method");
		 }
}
public class SuperCall extends TestA{

	SuperCall()
	{
		
		super(10);//Step 2 will call TestA contrcutor with parameter 10
		System.out.println("dddd");
	}
	public static void main(String[] args) {

		new SuperCall();//Step 1 will call SuperCall contrcutor
		//new TestA(12);
		//SuperCall s= new SuperCall();
		/*s.disp();
		s.test();
		*/

	}

}
