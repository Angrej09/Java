package abstractpkg;

abstract class loans
{
	String Loan_type;
	double roi,loan_amount;
	int tenure;
	abstract double emi();
	loans(String loan_type,double roi,double loan_amount,int tenure)
	{
		this.Loan_type=loan_type;
		this.roi=roi;
		this.loan_amount=loan_amount;
		this.tenure=tenure;
	}
}

class HomeLoan1 extends loans
{

	HomeLoan1(String loan_type,double roi,double loan_amount,int tenure) {
		super(loan_type, roi, loan_amount, tenure);
		
	}

	@Override
	double emi() {
		double emi=(loan_amount*roi)/tenure;
		return emi;
	}
	
}

class Personal extends loans
{

	Personal(String loan_type,double roi,double loan_amount,int tenure) {
		super(loan_type, roi, loan_amount, tenure);
		
	}

	@Override
	double emi() {
		double emi=(loan_amount*roi)/tenure;
		return emi;
	}
	
}
public class EMI {

	public static void main(String[] args) {
		
		loans l1=new Personal("Personal loan", 15.5, 10000, 12);
		System.out.println("Personal loan EMI " +l1.emi());
		loans l2=new HomeLoan1("Home loan", 5.5, 560000, 12);
		System.out.println("Home loan EMI " +l2.emi());
		
		

	}

}
