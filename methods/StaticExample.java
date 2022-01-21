package methods;

public class StaticExample {
	
		static void increment()
		{
			
			int i=10;	
			i++;
			System.out.println(i);
			++i;
			System.out.println("i value is " + i++);//i value is not incremented while printing
			System.out.println("i value is " + ++i);//i value incremented in the prevoius statment and again it is incrementd and printed
		
		}
	
		static void multiplication()
		{
			double n1=15.75,n2=15.75,n3=n1*n2;	
			System.out.println("Muliplication " +n3);
			
		}	
		
		static void carDetails()
		{
			String Car_Name="Swift";
			String Car_Manufacture="Maruti";
			
			
			System.out.println("Car_Name " +Car_Name);
			System.out.println("Car_Manufacture " +Car_Manufacture);
			
		}
	

	public static void main(String[] args) {
		
		increment();
		multiplication();
		carDetails();
		int i=50;
		System.out.println(i);

	}

}
