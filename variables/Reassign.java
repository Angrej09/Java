package variables;

public class Reassign {
			
			public static void main(String[] args) {
				
				byte b1='A',b2=127;
				System.out.println("b1 before reassign= "+b1);
				b1=b2;
				System.out.println("b1 after reassign= "+b1);
				System.out.println("b2 =" +b2);
			
				int i=10,j=20;
				System.out.println("i before reassign= " +i);
				i=j;
				System.out.println("i after reassign= " +i);		
				
				boolean b=false;
				System.out.println("b before reassign= " +b);
				b=true;
				System.out.println("b after reassign= " +b);
				
				char c1='a',c2=99;
				System.out.println("c1 before reassign= " +c1);
				c1=c2;				
				System.out.println("c1 after reassign= " +c1);
				
				
			
				
				
		


	}

}
