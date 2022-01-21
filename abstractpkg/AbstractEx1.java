package abstractpkg;

abstract class Shape
{
	String color;
	abstract String color();
	abstract double area();
	
	Shape(String color)
	{
		this.color=color;
		
	}
}

class Traingle extends Shape
{
	double b,h;
	Traingle(String color,double b,double h)
	{
		super(color);
		this.b=b;
		this.h=h;
	}
	
	@Override
	String color() {
		
		return super.color;
	}

	@Override
	double area() {
		double area=(b*h)/2;
		return area;
		
	}
	
}
class Square extends Shape
{
	double a;
	Square(String color,double a)
	{
		super(color);
		this.a=a;
	}
	@Override
	String color() {
		return super.color;
	}

	@Override
	double area() {
		double area=a*a;
		return area;
		
	}
	
}
public class AbstractEx1 {

	public static void main(String[] args) {
			Shape s1	=new Traingle("Red",2.5,3.5);
			System.out.println("Color of traingle is " +s1.color() +" and area is " +s1.area());
			Shape s2	=new Square("Blue",5.5);
			System.out.println("Color of square is " +s2.color() +" and area is " +s2.area());

	}

}
