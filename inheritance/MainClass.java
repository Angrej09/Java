package inheritance;

class Car
{
	void car()
	{
		System.out.println("Cars color");
	}
}

class Audi extends Car
{
	void color_Audi()
	{
		System.out.println("Audi color");
	}
}
class Skoda extends Car
{
	void color_Skoda()
	{
		System.out.println("Skoda color");
	}
}
class Renault extends Car
{
	void color_Renault()
	{
		System.out.println("Renault color");
	}
}
public class MainClass {

	public static void main(String[] args) {
		
		Audi a=new Audi();
		a.car();
		a.color_Audi();
		
		Skoda s=new Skoda();
		s.car();
		s.color_Skoda();
		
		Renault r=new Renault();
		r.car();
		r.color_Renault();
	}

}
