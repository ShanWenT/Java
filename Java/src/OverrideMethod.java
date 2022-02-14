class Plane{
	
	void fly(){
		System.out.println("Plane is flying");
	}
	
	void land(){
		System.out.println("Plane is landing");
	}
	
	void takeoff() {
		System.out.println("Plane is taking off");
	}
	
}

class FighterPlane extends Plane{
	
	void fly() {
		System.out.println("FighterPlane is flying at higher altitutde");
	}
}

class CargoPlane extends Plane{
	
	void fly() {
		System.out.println("Cargoplane is flying at lower altitutde");
	}
	void carry() {
		System.out.println("Cargoplane carry cargo");
	}
	
}

class JetPlane extends Plane{
	
	
	void fly() {
		System.out.println("Jetplane is flying at medium altitutde");
	}
	
}

class OpPlane{
	static void permit(Plane p) {
		p.fly();
		
	}
}


public class OverrideMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane jp = new JetPlane();
		FighterPlane fp=new FighterPlane();
		CargoPlane cp=new CargoPlane();
		//Plane p=new Plane();
		
		OpPlane.permit(jp);
		OpPlane.permit(fp);
		OpPlane.permit(cp);
		
		
	}

}
