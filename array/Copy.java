package array;
public class Copy {

	
	public static void main(String[] args) {

		int a[]= {1,2,5};
		int al=a.length;
		a[0]=1;
		//a[2]=10;
		//System.out.println(a[2]);
		//System.out.println(al);
		int b[]=new int[al];
		for(int i=0;i<al;i++)
		{
			 b[i]=a[i];
			 System.out.println(b[i]);
			 
		}
		int arr[]={4,4,5};  
		//getting the class name of Java array  
		Class<? extends int[]> c=arr.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(name);  
		 
		
	}
}