package inheritance;

class Vechile
{
	void disp()
	{
		System.out.println("Vachile class ");
	}
	int add(int a)
	{
		System.out.println(+a+ " from Vechile class");//3- 50 from Vechile class"
		return a;
	}
}

class Lorry extends Vechile
{
	int j=10;
	void lorry()
	{
		System.out.println("Lorry class");
	}
	
}

class Tata extends Lorry
{
	
	void tata()
	{
		System.out.println("Tata class");
	}
	int add(int a) 
	{
		super.add(50);//this will call super class//step-2
		System.out.println(+ a +  "  from Tata class");//Step 4-11 from Tata class"
		return a;
	}
}

public class MultiLevel1 extends Tata {
	
	void multi()
	{
		super.add(11);//-1
		System.out.println("Multilevel inheritance example");
	}
	
	public static void main(String[] args) {

		MultiLevel1 m=new MultiLevel1();
		m.disp();
		m.lorry();
		m.tata();
		m.multi();//--
		m.add(20);//--
		System.out.println(m.j);
		Tata t=new Tata();
		//t.multi()--- not acccessible  multi() only from child and above 

	}


}
