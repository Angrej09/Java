package methods;

public class BankBal {

	public static void main(String[] args) {
		/*withdraw 5000 from a bank , 
		initial balance = 10000. 
		If bal is not sufficient print appropriate messages.
		3 operations - successfull withdrawl  ,
		unsuccessfull withdrawl  , remaining balance*/

		
		int withdrawAmt=5000;
		int initial_balance=10000;
		int balance=initial_balance-withdrawAmt;
				
		if(initial_balance >= withdrawAmt)
		{
			System.out.println("successfult withdrawl &  Avaliable balance is " +balance);
		}
		else
		{
			System.out.println("unsuccessfult withdrawl");
		}
		
	}

}
