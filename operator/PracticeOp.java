package operator;

public class PracticeOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int x = 5; 
		int y = 2; 
		y = y + x++; 
			2 + 5
		y	=2 +5= 7
		
		x  x + ++y;
			
		x=  6	+ 8
			
		//y=8 x=14
				
		System.out.println("y " + y);
		System.out.println("x " + x);*/
		
		//////////////////////////////////////

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
					
				/////////////////////////////////////////////
		
		int x=5;
		int y=7;
		int z ; 
		
		z=++x + ++y ;
		//z= 6 + 8= 14
		
		
		System.out.println("x "  +x);
		System.out.println("y " +y);
		System.out.println("z " +z);
		
		int x1=5;
		int y1=7;		
		int z1 ; 
		z1=x1++ + y1++ ;
		// z1= 5+7=12
		//    6  8
		
		System.out.println("x1 " +x1);
		System.out.println("y1 "  +y1);
		System.out.println("z1 " +z1);
		

		int x2=5;
		int y2=7;		
		int z2 ; 	
		z2 = --y2 + ++x2 - x2++ + y2++ - ++y2;
		
		//z2= 6 + 6 -     6 +    6   - 8 =4
		// 				  7
		
		System.out.println("x2 " +x2);
		System.out.println("y2 "  +y2);
		System.out.println("z2 " +z2);
		
		int x3=5;
		int y3=7;		
		int z3 ; 
		z3= y3++ - --x3 + ++y3 - x3--;
		
		// z3 = 7- 4 +   9   -  4 = 8
		//						3
		
		System.out.println("x3 " +x3);
		System.out.println("y3 "  +y3);
		System.out.println("z3 " +z3);
		
		int	p= 4 ; 
		int q = 2 ; 
		int r = p++ - --p * ++q * p-- - q-- - q ;
		// r=   4	- ( 4   * 3 * 4)  - 3   - 2 = -49
		//		5				  3		2
		
		//p= 3,q=2,
		
		System.out.println("p " +p);
		System.out.println("q "  +q);
		System.out.println("r " +r);
		
		

	}

}
