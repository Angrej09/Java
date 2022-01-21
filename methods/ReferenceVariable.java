package methods;

public class ReferenceVariable {
		
		double radius ;
		
		public void setData(double r)
		{
			radius=r ; 
		}
			
		public double areaCircle()
		{
			double area = 3.14 * radius * radius ; 
			return area;
		}
		
		public static void main(String[] args)
		{
			ReferenceVariable p = new ReferenceVariable();
			p.setData(2.5);
//			double r = p.radius;
//			System.out.println("radius " +r);
//			double b = p.areaCircle();
//			System.out.println(b);
			 
			double c = new ReferenceVariable().areaCircle();
			System.out.println(c);
		}

}
