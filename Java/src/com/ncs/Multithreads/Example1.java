package com.ncs.Multithreads;

class Washroom implements Runnable // class can extends/inherit from other classes
{
	synchronized public void run()
	{
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the washroom");
			Thread.sleep(2000);	
			System.out.println(Thread.currentThread().getName()+" has started using washroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" has left the washroom");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}

public class Example1 {

	public static void main(String[] args) 
	{
		Washroom w = new Washroom();
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		
		t1.setName("Ben");
		t2.setName("Riya");
		t3.setName("Tommy");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
