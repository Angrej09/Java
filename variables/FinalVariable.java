package variables;

public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		a=b;
		b=30;
		
		System.out.println("a  " +a);
		System.out.println("b  " +b);
		
		final double pi=3.14;
			double pi1=pi;
			//pi=4.5; re-initialize not possible
			//pi=a;  re-assignment not possible
			
			System.out.println("pi " +pi);
			System.out.println("pi1 " +pi);
				
	}

}
