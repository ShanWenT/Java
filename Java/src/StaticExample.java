class Demo3
{
	static int a=10, b=20; // static variable
	int c=30, d=40;
	
	static
	{
		System.out.println("This is a static block");
		System.out.println("a: " +a+" b:  "+b);
	}
	
	{
		System.out.println("This is a non-static block");
		System.out.println("c: " +c+" d:  "+d);
	}
	
	
	static void fun1() {
		System.out.println("This is a static method");
	}
	void fun2() {
		System.out.println("This is a non-static method");
	}
	Demo3(){
		System.out.println("This is a constructor");
	}
	
}


public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3.fun1();
		Demo3 d3= new Demo3();
		d3.fun2();

	}

}
