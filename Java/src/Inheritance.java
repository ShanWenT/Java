class Parent{
	int accno=12345;
	int pwd=67890;
}

class Child extends Parent{
	
	void change(int accno, int pwd) {
		this.accno=accno;
		this.pwd = pwd;
	}
}

class Demo5{
	int a;
	int b;
	
	Demo5(){
		a=99;
		b=88;
	}
	
	Demo5(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}

class Demo6 extends Demo5{
	int c;
	int d;
	
	Demo6(){
		super();
		c=999;
		d=888;
	}
	
	Demo6(int c, int d)
	{
		super(9999, 8888);
		this.c=c;
		this.d=d;
	}
	
	void disp(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.change(1111, 2222);
		System.out.println(c.accno+"    "+c.pwd);
		
		Demo6 d6 = new Demo6(100,200);
		d6.disp();
		
	}

}
