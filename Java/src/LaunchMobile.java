
class OS 
{
	String name;
	float ver;
	
	OS(String name, float ver){
		this.name = name;
		this.ver=ver;
		
	}
}


class Charger{
	String brand;
	int volt;
	
	Charger(String brand, int volt)
	{
		this.brand = brand;
		this.volt = volt;
	}
}

class Mobile
{
	OS os = new OS("Android", 11.0f);
	
	void accessOS()
	{
		System.out.println(os.name+" "+os.ver);
	}
	void hasA(Charger c)
	{
		System.out.println(c.brand);
		System.out.println(c.volt);
	}
}

public class LaunchMobile {

	public static void main(String[] args) {
		Charger c = new Charger("OnePlus", 20);
		
		Mobile m = new Mobile();
		//m.accessOS();
		//m.hasA(c);
		m=null;
		//m.accessOS();
		System.out.println(c.brand);
		System.out.println(c.volt);
		
	}

}
