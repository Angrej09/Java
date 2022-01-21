package methods;

public class AreaNonstatic{
 public void suare(double a)
{
	double sarea;
	sarea= a*a;
	System.out.println("square area " +sarea);
}
 public void rectangle(double b,double h)
{
	double rarea;
	rarea= b*h;
	System.out.println("trianlge area " +rarea);
}
 public void triangle(int b,float h)
{
	double tarea;
	tarea= (b*h)/2;
	System.out.println("trianlge area " +tarea);
}
 public void circle(long r)
{
	final double pi=3.14;
	double carea;
	carea= pi*r*r;
	System.out.println("circle area " +carea);
}
public static void main(String[] args) {
	
	
	new AreaNonstatic().suare(10.5);
	new AreaNonstatic().rectangle(5.5,4.5);
	new AreaNonstatic().triangle(10,5.5f);
	new AreaNonstatic().circle(5l);
	}


}
