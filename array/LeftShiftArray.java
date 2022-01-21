package array;

public class LeftShiftArray {

	public static void main(String[] args) {
		 int[] num = {1,2,3,4,5}; // left shift    23451(1) 34512(2)
		  int n = 2;
		  int temp ;
		  
		  for(int i=0 ; i< n ; i++)
		  {
			  
			  temp= num[0];
			 for(int j=0 ; j<num.length-1 ; j++)
			 {
				
				 num[j]=num[j+1];
			 }
			
			 num[num.length-1]=temp;
					 
		  }
		  for(int k=0 ; k<num.length ; k++)
			  System.out.print(" " +num[k]);

	}

}
