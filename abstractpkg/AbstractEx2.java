package abstractpkg;

abstract class Loan
{
	String Loan_type;
	double interest_rate,loan_amount;
	int tenure;
	abstract double Edu_Loan();
	abstract double Home_Loan();
	abstract double Personal_Loan();
	
	Loan(String loan_type,double interest_rate,double loan_amount,int tenure)
	{
		this.Loan_type=loan_type;
		this.interest_rate=interest_rate;
		this.loan_amount=loan_amount;
		this.tenure=tenure;
		
	}
	
}

class EducationLoan extends Loan
{

	EducationLoan(String loan_type, double interest_rate, double loan_amount, int tenure) {
		super(loan_type, interest_rate, loan_amount, tenure);
		
	}

	@Override
	double Edu_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}

	@Override
	double Home_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}

	@Override
	double Personal_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}
}
class HomeLoan extends Loan
{

	HomeLoan(String loan_type, double interest_rate, double loan_amount, int tenure) {
		super(loan_type, interest_rate, loan_amount, tenure);
		
	}

	@Override
	double Home_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}

	@Override
	double Edu_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}

	@Override
	double Personal_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}
	
}
class PersonalLoan extends Loan
{

	PersonalLoan(String loan_type, double interest_rate, double loan_amount, int tenure) {
		super(loan_type, interest_rate, loan_amount, tenure);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double Personal_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}

	@Override
	double Edu_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}

	@Override
	double Home_Loan() {
		double EMI=(loan_amount*interest_rate)/tenure;
		return EMI;
	}
}

public class AbstractEx2 {

	public static void main(String[] args) {

		Loan l1=new EducationLoan("Educational loan",2.5,1000,12);
		System.out.println(l1.Edu_Loan());
		
		Loan l2=new HomeLoan("Home loan",8.5,50000,12);
		System.out.println(l2.Edu_Loan());
		
		Loan l3=new PersonalLoan("Personal loan",17.5,10000,12);
		System.out.println(l3.Edu_Loan());
		

	}

}
