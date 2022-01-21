package array;

public class BubbleSort {

public static void main(String args[]) {
	int a[]= {110,21,30,41};//decalrion and intialaization
	
	/*int a[]=new a[4];//declaration
	a[0]=110; //intialization
	a[1]=21;
	a[2]=30;
	a[3]=41;*/
	
	
	//average of the given numbers
	float sum=0;
	for(int k=0;k<=a.length-1;k++)
	{
		 sum=sum+a[k];
		 
	}
	 System.out.println("sum " +sum);
	float avg=sum/a.length;
	System.out.println("average " +avg);		
	
	
	for(int i=0;i<a.length-1;i++)
			{	
				if(a[i]>a[i+1]) 
				{
					int temp;
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;					
				}			
			}
			//smallest number 
			System.out.println("SMALLEST NUMBER " +a[0]);
			//biggest number
			System.out.println("Biggest Number " + a[a.length-1]);
			//sorting
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[j]);
			}
			 
			
	}
}	
		
