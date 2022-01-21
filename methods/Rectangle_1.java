/*Develop a class rectangle
The class should have following data members
	1. Length
	2. Width
The class should have following member methods
	1. Method setData() that will set the values of length and width
	2. Method areaRect() to find the area of rectangle*/

package methods;

public class Rectangle_1
{
	static int length;//value 0
	int width;//value 0
	 void setdata(int l,int w)
	{
		length=l;//10
		width=w;//20
		//arerect();
	}
	void arerect()
	{
		int area=length+width;
		System.out.println(area);
		
	}
	public static void main(String[] args) {
		new Rectangle_1().setdata(10,20);
		new Rectangle_1().arerect();//w re-insitalize and made w=0, l=10 l is static
		

		//static - if the value of the variable is not varied from object to object .
				//instance -if the value of the variable is varied from object to object 

	}

}
