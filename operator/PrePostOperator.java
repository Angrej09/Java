package operator;

public class PrePostOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a = 2;
		int b=3;
		int c = a++ + b + b++ + ++a + a + ++a;
			//	2	+ 3	+ 3   +	4	+ 4	+ 5 =
			//	3	  3	  4	   4	  4	 5  
		//a=5  b=4 c=21
				System.out.println("a " +a);
				System.out.println("b " +b);
				System.out.println("c " +c);
				
			
		int x = -3;
		int y = -4;
		int z = x++ - --y  +  --x - y++ +   y +    x +   ++x  - x--  +  y--;
			//	(-3)- (-5) + (-3)- (-5) + (-4) + (-3) +  (-2) - (-2) + (-4) = -7
			//	-2	  -5	 -3	  -4					  -2	-3	    -5
			//x=-3  y=-5 z=-7
					System.out.println("x " +x);
					System.out.println("y " +y);
					System.out.println("z " +z);*/
					
		int x = 2 ; 
		int y = -3;
		int z = x++ - --x - ++y *x + y-- * x-- + x++ + y++ + y - --y;
	//z=		2	- 2	  - (-2) *2+ (-2) *2	+1	 +(-3) +(-2)- (-3)=-1
			  //3	  2				  -3   1	 2	   -2
		System.out.println("x " +x);
		System.out.println("y " +y);
		System.out.println("z " +z);
		
	}	

}
