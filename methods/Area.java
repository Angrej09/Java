package methods;

//area of square , rectangle , triangle , circle 

public class Area {
	
	static void suare(double a)
	{
		double sarea;
		sarea= a*a;
		System.out.println("square area " +sarea);
	}
	static void rectangle(double b,double h)
	{
		double rarea;
		rarea= b*h;
		System.out.println("trianlge area " +rarea);
	}
	static void triangle(int b,float h)
	{
		double tarea;
		tarea= (b*h)/2;
		System.out.println("trianlge area " +tarea);
	}
	static void circle(long r)
	{
		final double pi=3.14;
		double carea;
		carea= pi*r*r;
		System.out.println("circle area " +carea);
	}
	public static void main(String[] args) {
		
		
		suare(10.5);
		rectangle(5.5,4.5);
		triangle(10,5.5f);
		circle(5l);
	}

}
