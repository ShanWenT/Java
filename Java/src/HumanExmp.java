class Brain
{
	int IQ;
	
	Brain(int IQ){
		this.IQ=IQ;
	}
}


class Heart{
	String heartBeat;
	
	Heart(String heartBeat){
		this.heartBeat=heartBeat;
	}
}

class Book1{
	String bookType, name;
	
	 Book1(String bookType, String name){
		this.bookType=bookType;
		this.name=name;
	}
}

class Laptop{
	String brand;
	Laptop(String brand){
		this.brand=brand;
	}
}

class Human{
	Brain b = new Brain(100);
	Heart h = new Heart("Heart is beating");
	
	
	void hasA(Book1 b) {
		System.out.println(b.bookType);
		System.out.println(b.name);
	}
	
	void hasA(Laptop l) {
		System.out.println(l.brand);
	}
}
public class HumanExmp {

	public static void main(String[] args) {
		
		Book1 b=new Book1("Children","Little Red Riding Hood");
		Laptop l=new Laptop("Dell");
		Human h=new Human();
		
		System.out.println(h.h.heartBeat);
		System.out.println(h.b.IQ);
		h=null;
		//System.out.println(h.h.heartBeat);
		//System.out.println(h.b.IQ);
		System.out.println(b.bookType);
		System.out.println(l.brand);
	
		
		
	}

}
