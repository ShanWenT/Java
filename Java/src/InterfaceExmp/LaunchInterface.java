package InterfaceExmp;

interface MyCalculator
{
	void add(); // public abstract void add();
	void sub(); // public abstract void sub();
	void div(); // public abstract void div();
	void mul(); // public abstract void mul();
}

class InterfaceImpl implements MyCalculator
{

	@Override
	public void add() {
		System.out.println("This is add()");
		
	}

	@Override
	public void sub() {
		
		System.out.println("This is sub()");
	}

	@Override
	public void div() {
		
		System.out.println("This is div()");
	}

	@Override
	public void mul() {
		
		System.out.println("This is mul()");
	}
	
}

public class LaunchInterface {

	public static void main(String[] args) {
		InterfaceImpl ii= new InterfaceImpl();
		ii.add();
		ii.sub();
		ii.div();
		ii.mul();
		
	}

}