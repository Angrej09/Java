package methods;

public class ReturnTypeMethods {
	
	static void multiplication()
	{
		double n1=15.75,n2=15.75,n3=n1*n2;	
		System.out.println("Muliplication " +n3);
		
	}	
		
	static int add() {
		
		int a=10;
		double b=20.5,c=a+b;
		System.out.println(c);
		return (int) c;
		
	}
	static String details() {
		
		String firstname="Angrej";
		String lastname="Singh";
		String fullname=firstname+lastname;
		System.out.println(fullname);
		return fullname;
		
	}

	public static void main(String[] args) {
		
		int a=add();
		System.out.println(a);
		details();

	}

}
