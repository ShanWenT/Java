package Bank;

import java.util.Scanner;

class ATM
{
	Scanner sc = new Scanner(System.in);
	int acno = 2345, pwd = 5678;
	int an,pw;
	
	void input() {
		System.out.println("Enter the account no.");
		an = sc.nextInt();
		System.out.println("Enter the password:");
		pw = sc.nextInt();
	}
	
	void verify() throws Exception
	{
		if(acno == an && pwd == pw)
		{
			System.out.println("Collect Money");
		}
		else {
			InvalidCredentialsException ice = new InvalidCredentialsException();
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}

class BankofA
{
	ATM atm= new ATM();
	
	void begin()
	{
		try {
			atm.input();
			atm.verify();
		}
		catch(Exception e)
		{
			try {
				atm.input();
				atm.verify();
			}
			catch(Exception f)
			{
				try {
					atm.input();
					atm.verify();
				}
				catch(Exception g)
				{
					System.out.println("Card is blocked");
					System.exit(0);
				}
			}
		}
		
	}
}

class InvalidCredentialsException extends Exception{
	@Override
	public String getMessage() {
		
		return "Account no or password is invalid";
	}
}



public class BankExmp {

	public static void main(String[] args) {
		
		BankofA boa = new BankofA();
		boa.begin();

	}

}
