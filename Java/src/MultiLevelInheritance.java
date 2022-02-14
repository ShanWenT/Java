abstract class Bird
{
	abstract void fly();
	abstract void eat(); // abstract method
}

abstract class Eagle extends Bird
{
	
}

class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrows fly at a low altitude");
	}
	
	void eat() {
		System.out.println("Sparrows eat grains and other insects");
	}
}

class GoldenEagle extends Eagle{
	void fly() {
		System.out.println("Golden eagle fly over the ocean");
	}
	void eat() {
		System.out.println("Golden eagle eat fishes");
	}
}

class SerpantEagle extends Eagle
{
	void fly() {
		System.out.println("Serpant eagle fly over the mountain");
	}
	void eat() {
		System.out.println("Serpant eagle eat insects");
	}
}

class OpBird
{ 
	static void permit(Bird b) {
		b.fly();
		b.eat();
		
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldenEagle ge = new GoldenEagle();
		SerpantEagle se = new SerpantEagle();
		Sparrow s=new Sparrow();
		
		OpBird.permit(s);
		OpBird.permit(se);
		OpBird.permit(ge);
		
		
		
	}

}
