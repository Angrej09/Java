package constructor;

public class UserDefined_Parameterized {

		int i;
		String s;
		
		UserDefined_Parameterized(int a,String s1)//  parameterized User defined constructor
		{
			i=a;
			s=s1;
			System.out.println("i value is "+i +" and s value is " +s);//after constructor invoked will assign the parameterized value for i and s
		}

		public static void main(String[] args) {
			 
			new UserDefined_Parameterized(10,"Angrej");//constructor invoked	
			

	}

}
