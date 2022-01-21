package interfacepkg;
/** interface is by default abstract 
 * all methods inside interface by default abstarct
 * all variables by default in final and  static
 * interface use implemnets keyword for inheriting class and extends for interface
 * interface can't inherit class
 * can't create object 
 *  100% abstraction achieved
 * @author hp
 *
 */

 interface inter  // by default abstract
{
	
	 void test() ;  // method declaration
	void disp() ; 
	
	int a = 10 ;
		 
	
}


 abstract class qwerty implements inter{

	public void test()
	{
		System.out.println("test");
	}


}

public class InterfaceEx1 extends qwerty
{
	public void disp()
	{
		System.out.println("disp");
	}

	public static void main (String[] args)
	{
		
		InterfaceEx1 s = new InterfaceEx1() ; 
		s.disp();
		s.test();
		
		System.out.println(inter.a) ; //
		System.out.println(s.a) ; 
		
	}
}

