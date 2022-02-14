class Parent1
{
	void pocketMoney() {
		System.out.println("Pocket money is $20");
	}
}

class Child1 extends Parent1
{
	@Override
	void pocketMoney() {
		System.out.println("Pocket money is $200");
	}
	
	void drinksAlcohol(){
		System.out.println("Alcohol");
	}
}



public class ActualPolymorphism {

	public static void main(String[] args) {
		
		Parent1 c = new Child1();
		c.pocketMoney();
		((Child1)(c)).drinksAlcohol(); //downcasting
		
	}

}
