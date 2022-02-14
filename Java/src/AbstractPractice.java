abstract class Animal{
	abstract void eat();
	abstract void sleep();
}

class Deer extends Animal{
	@Override
	void eat() {
		System.out.println("Deer grazes and eats");
	}
	
	@Override
	void sleep() {
		
		System.out.println("Deer sleeps in the bush");
	}
}

class Lion extends Animal
{
	@Override
	void eat() {
		System.out.println("Lion hunts and eat");
	}
	
	@Override
	void sleep() {
		
		System.out.println("Lion sleep in a cave");
	}
	
}

class Monkey extends Animal
{
	@Override
	void eat() {
		System.out.println("Monkey eat bananas");
	}
	
	@Override
	void sleep() {
		
		System.out.println("Monkey sleep on the trees");
	}
	
}

class Zoo
{
	static void live(Animal a) 
	{
		a.eat();
		a.sleep();
	}
}

public class AbstractPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer d = new Deer();
		Lion l= new Lion();
		Monkey m= new Monkey();
		
		Zoo.live(d);
		Zoo.live(l);
		Zoo.live(m);
	}

}
