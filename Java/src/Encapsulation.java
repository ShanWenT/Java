class Book
{
	private int pgno;
	
	Book(int pgno)
	{
		if(pgno>0)
		{
			this.pgno=pgno; // shadowing problem in java
		}
		else {
			System.out.println("Page no cannot be negative");
			System.exit(0);
		}
	}
	
	int getData()
	{
		return pgno;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book(100);
		System.out.println("Page no is:"+ b.getData());
	}

}
