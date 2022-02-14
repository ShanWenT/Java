package HotelBill;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyHotel extends BasicHotel
{

	public enum Menu{
		NotUsed(0),HotCoffee(5),HotTea(4),CocaCola(3),BottledWater(2);
		
		private int price;
		Menu(int price){
			this.price=price;
		}	
	}
	
	Scanner sc= new Scanner(System.in);
	Menu product[] = Menu.values();
	
	
	ArrayList<Bill> al = new ArrayList<Bill>();
	static int userChoice, prodQuantity, subTotal;
	double gstRate=0.07, tipAmt,gstAmt,totalBill;
	static char cho='Y';
	static String addChoice, productItem;
	private String name, email;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	
	@Override
	void dispMenu() {
		System.out.println("*************************\n         Menu        \n*************************\nSlNo   ItemName     Price");
		System.out.println("1      HotCoffee     $5\n2      HotTea        $4\n3      CocaCola      $3\n4      Bottled Water $2");
		System.out.println("*************************");
	}
	
	@Override
	void getUserDetails() {
		System.out.println("Enter the user name: ");
		name = sc.nextLine();
		System.out.println("Enter the user emailID: ");
		email = sc.nextLine();
		System.out.println("Enter tip amount: ");
		tipAmt = sc.nextInt();
		
	}
	
	
	
	@Override
	void getUserInput() 
	{
		
		while(cho=='Y') {
			
			System.out.print("Select your choice: ");
			userChoice = sc.nextInt();
			while(userChoice<=0||userChoice>product.length)
			{
				System.out.print("Invalid Choice. Please select again: ");
				userChoice = sc.nextInt();
			}
			
			
			System.out.print("Select Quantity: ");
			prodQuantity = sc.nextInt();
			while(prodQuantity<=0)
			{
				System.out.print("Invalid Choice. Please select again: ");
				prodQuantity = sc.nextInt();
			}
			calculate(userChoice, prodQuantity);
			System.out.println("Do you want to order anything else? [y/n]: ");
			addChoice = sc.next();
			addChoice = addChoice.toUpperCase();
			cho = addChoice.charAt(0);	
		}		
	}
	
	@Override
	void calculate(int userChoice, int prodQuantity) {
		
		switch(userChoice) {
		case 1:
			productItem = product[userChoice].toString()+"   ";
			subTotal = prodQuantity*product[userChoice].price;
			break;
		case 2:
			productItem = product[userChoice].toString()+"      ";
			subTotal = prodQuantity*product[userChoice].price;
			break;
		case 3:
			productItem = product[userChoice].toString()+"    ";
			subTotal = prodQuantity*product[userChoice].price;
			break;
		case 4:
			productItem = product[userChoice].toString();
			subTotal = prodQuantity*product[userChoice].price;
			break;
			default: System.out.println("Invalid Input");
		}
		al.add(new Bill(productItem,product[userChoice].price,prodQuantity,subTotal));
		
		totalBill += subTotal;
		
		
		
		
	}

	@Override
	void print() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		System.out.println("___________________________________");
		System.out.println("     Bill No:"+(new Random()).nextInt(999999999));
		System.out.println("     Customer Name: "+name);
		System.out.println("     Customer Email: "+email);
		System.out.println("___________________________________");
		System.out.println("ItemName  Price  Quantity  SubTotal");
		System.out.println("___________________________________");
		for(Bill b : al)
		{
			System.out.println(b);
		}	
		gstAmt=totalBill*gstRate;
		System.out.println("GST:			       "+df.format(gstAmt));
		System.out.println("Tip:			       "+tipAmt);
		System.out.println("___________________________________");
		totalBill=totalBill+tipAmt+gstAmt;
		System.out.println("Payable GrandTotal is :       " +df.format(totalBill));
		System.out.println("___________________________________");
		
		
		
		
	}
}
