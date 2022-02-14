package InterfaceExmp;

interface Demo
{
	//public static final int count = 0;
	void Demo1();
	
	default void Demo2() {
		System.out.println("This is demo2()");
	}
	static void Demo3() {
		System.out.println("This is demo3()");
	}
}

class InterfaceDemo implements Demo{

	@Override
	public void Demo1() {
		System.out.println("This is demo1()");
		
	}
	
	
}

public class InterfaceExmp {

	public static void main(String[] args) {
		InterfaceDemo id = new InterfaceDemo();
		id.Demo1();
		id.Demo2();
		Demo.Demo3();
		

	}

}
