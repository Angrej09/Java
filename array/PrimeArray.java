package array;

public class PrimeArray {

	public static void main(String[] args) {
		
		int a[]= {13,20,7,45};
		
		for(int i=0;i<a.length;i++)
		{
			
			int flag=0;
			for(int j=2;j<a[i];j++)
			{
				
				if(a[i]%j==0)
				{
					flag++;
					break;
				}
				
			}
			if(flag == 1)
			{
				System.out.println("not prime");
			}
			else
			{
				System.out.println("prime");
			}
			
		}
	}

}
