//Numeric promotion
class Test2
{
	void add(int a,float b)
	{
		System.out.println("this is add() int and float");
		System.out.println(a+b);
	}
	
	void add(double a, float b)
	{
		System.out.println("this is add() double & float");
		System.out.println(a+b);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		
		double a=20.5, b=10.5;

			
		Test2 t4 = new Test2();
		// t4.add(b, a); // will give error because float cannot be converted to double
	}

}
