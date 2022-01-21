package interfacepkg;

interface EMIEx
{
	int tenure=10;
	int emi(int amount,int roi); 
}

class VechileLoan implements EMIEx
{

	@Override
	public int emi(int amount,int roi) {
		int emi=(amount*roi)/tenure;
		return emi;
	}
	
}

class Edu_Loan implements EMIEx
{

	Edu_Loan(int amount,int roi)// amount and roi are parameters
	{
		int emi=(amount*roi)/tenure;
		System.out.println("educational loan emi through contrcutor " +emi);
	}
	@Override
	public int emi(int amount,int roi) {
		int emi=(amount*roi)/tenure;
		return emi;
	}
	
}
public class EMITest   {

	public static void main(String[] args) {
		
		EMIEx emiedu=new Edu_Loan(200, 10);//arguments
		int emiamount=emiedu.emi(100, 5);
		System.out.println("educational loan emi through method  " +emiamount);
		
		EMIEx emiveh=new VechileLoan();
		System.out.println("Vechile loan emi " +emiveh.emi(300, 5));
		
		

	}

}
