

class Car{
	String brand;
	String model;
	int milage;
	
	void display()
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(milage);
	}
	
	void start()
	{
		System.out.println("Car is starting up");
	}
	void move()
	{
		System.out.println("Car is moving");
	}
	void accelerateFast()
	{
		System.out.println("Car is accelerating");
	}
	void stop()
	{
		System.out.println("Car is stopped");
	}
}





public class OOP {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Car();
		car1.brand="bmw";
		car1.model="model 3";
		car1.milage=2000;
		car1.display();
		car1.start();
		car1.move();
		car1.accelerateFast();
		car1.stop();
		
		
		
	}

}
