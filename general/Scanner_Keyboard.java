package general;

import java.util.Scanner;

public class Scanner_Keyboard {

	public static void main(String[] args) {
		// To read input from keyboard
				// import java.util.Scanner
				
				// To read a String value  ---> next()
				// To read a int  ---> nextInt()
				// To read a double value  ---> nextDouble()
				// To read a character value  ---> next().charAt();
				
						Scanner s = new Scanner(System.in);//Scanner and System is class and in is static variable
						System.out.println("Enter any String value");
						String st=s.next();
						System.out.println("Entered String value  " +st);
						
	}

}
