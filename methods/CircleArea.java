/*Develop a class Circle which has one data member - radius
The class has the following methods
	setData()
	area()
	circumference()*/
package methods;

public class CircleArea {

	int radius;
	final double pi=3.14;
	void setData(int r)
	{
		radius=r;
		area();
		circumference();
	}
	void area()
	{
		double area=pi*radius*radius;
		System.out.println(area);
	}
	void circumference()
	{
		double cir=2*pi*radius;
		System.out.println(cir);
	}
	public static void main(String[] args) {
		
		new CircleArea().setData(18);
	}

}
