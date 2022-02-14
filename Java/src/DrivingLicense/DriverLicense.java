package DrivingLicense;

import java.util.Scanner;

class Form
{
	Scanner sc = new Scanner(System.in);
	int age;
	
	void input()
	{ 
		System.out.println("Enter your age:");
		age = sc.nextInt();
	}

	void verify() throws Exception
	{
		if(age>=18 && age <=70) {
			System.out.println("Issue Driving license");
		}
		else {
			InvalidAgeException iae = new InvalidAgeException();
			System.out.println(iae.getMessage());
			throw iae;
		}
	}
}

class DrivingSchool
{
	Form f = new Form();
	
	void verification()
	{
		try 
		{
			f.input();
			f.verify();
		}
		catch(Exception e) {
			System.out.println("License revoked");
			System.exit(0);
		}
		
	}
	
}

class InvalidAgeException extends Exception{
	@Override
	public String getMessage() {
		
		return "Age is less than 18 and more than 70";
	}
}



public class DriverLicense {

	public static void main(String[] args) {
		DrivingSchool ds = new DrivingSchool();
		ds.verification();

	}

}
