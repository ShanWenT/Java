package HotelBill;


public class Bill
{
	String itemName;
	int itemPrice,prodQuantity, subTotal;
	
	Bill(String itemName,int itemPrice,int prodQuantity, int subTotal){
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.prodQuantity=prodQuantity;
		this.subTotal=subTotal;
	}
 
	public String toString() {
		return itemName+"  "+itemPrice+"       "+prodQuantity+"         "+subTotal;
	}
}
