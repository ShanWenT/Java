class Test4
{
	int a,b;
	
	Test4(int a, int b){
		// super();
		this.a=a;
		this.b=b;
	}
	
	void fun()
	{
		System.out.println("Im the fun method");
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t4=new Test4(10, 20);
		t4.fun();
		System.out.println(Float.SIZE);
		
	}

}
