package com.ncs.Multithreads;

class Queue{
	int x;
	boolean value_in_x=false;
	synchronized void put(int x) 
	{
		if(value_in_x==false)
		{
			this.x=x;
			System.out.println("I have put "+x+"into X");
			value_in_x = true;
			notify();
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	synchronized void get()
	{
		if(value_in_x==true)
		{
			System.out.println("I have got"+ x + "from X" );
			value_in_x=false;
			notify();
		}
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Producer extends Thread
{
	Queue a;
	int z=0;
	
	Producer(Queue q)
	{
		a=q;
	}
	
	public void run()
	{
		while(true) 
		{
			a.put(z);
			z++;
		}
														
	}
}

class Consumer extends Thread
{
	Queue b;
	
	Consumer(Queue q)
	{
		b=q;
	}
	
	public void run()
	{
		while(true) 
		{
			b.get();		 
		}
			
	}	
}


public class ProducerConsumer {

	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.start();
		c.start();
	}

}
