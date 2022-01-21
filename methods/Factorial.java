package methods;

public class Factorial {

		static void factorial(int a)
		{
			int fact=1;
			for(int i=1;i<=a;i++)
			{
				fact=fact*i; 
			}

			/*for(;a>=1;a--)
			{
				fact=fact*a; 
			}*/
			System.out.println(fact);
		}
	
	
	
	
	public static void main(String[] args) {

			factorial(5);
			factorial(6);
			factorial(7);

	}

}
