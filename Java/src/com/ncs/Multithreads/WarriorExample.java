package com.ncs.Multithreads;

class Warrior extends Thread
{
	String res1="Super Power 1";
	String res2="Super Power 2";
	String res3="Super Power 3";
	
	public void run()
	{
		try {
			if(Thread.currentThread().getName().equals("Tommy"))
			{
				tommyAccRes();
			}
			else if(Thread.currentThread().getName().equals("Ben"))
			{
				benAccRes();
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
	}
	
	void tommyAccRes() throws Exception
	{
		synchronized(res1)
		{
			System.out.println("Tommy acc "+res1);
			Thread.sleep(5000);	
			
			synchronized(res2)
			{
				System.out.println("Tommy acc "+res2);
				Thread.sleep(5000);	
				
				synchronized(res3)
				{
					System.out.println("Tommy acc "+res3);
					Thread.sleep(5000);		
				}
			}	
		}
		
	}
	
	void benAccRes() throws Exception
	{
		synchronized(res1)
		{
			System.out.println("Ben acc "+res1);
			Thread.sleep(5000);	
			
			synchronized(res2)
			{
				System.out.println("Ben acc "+res2);
				Thread.sleep(5000);	
				
				synchronized(res3)
				{
					System.out.println("Ben acc "+res3);
					Thread.sleep(5000);		
				}
			}	
		}
	}
	
//	void test() throws Exception
//	{
//		
//		System.out.println("test acc "+res1);
//		Thread.sleep(5000);
//		
//	}
}



public class WarriorExample {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		
		w1.setName("Tommy");
		w2.setName("Ben");
		
		w1.start();
		w2.start();

	}

}
