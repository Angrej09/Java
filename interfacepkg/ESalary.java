package interfacepkg;

interface Clerk_Sal
{
	int days=22;
	int c_sal(int wages);
}

interface Mangaer_Sal
{
	int m_sal(int wages);
}

public class ESalary implements Clerk_Sal,Mangaer_Sal {

	public static void main(String[] args) {
		
		Clerk_Sal cs=new ESalary();
		System.out.println("clerk salary " +cs.c_sal(20));//clerk salary
		
		Mangaer_Sal ms= new ESalary();
		System.out.println("manager salary " +ms.m_sal(30));//manager salary

	}

	@Override
	public int m_sal(int wages) {
		
		int sal=wages*days;
		return sal;
	}

	@Override
	public int c_sal(int wages) {
		int sal=wages*days;
		return sal;
	}

}
