//class A {
//	protected int x;
//	
//	public void setValue(int x) {
//		x=x*x;
//		System.out.println(this.x);
//	}
//}


public class STM {

	public static void main(String[] args) {
//		A a = new A();
//		int x=100;
//		a.x=50;
//		a.setValue(x);
		System.out.println(mystery(4));

	}
	
	static int mystery(int number) {
		if(number <= 1)
			return 1;
		else return number*mystery(number -1);
	}

}
