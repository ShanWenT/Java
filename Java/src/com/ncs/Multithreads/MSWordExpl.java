package com.ncs.Multithreads;

class MSWord extends Thread
{
	
	public void run() 
	{
		if(Thread.currentThread().getName().equals("TYPE"))
		{
			type();
		}
		else if(Thread.currentThread().getName().equals("SC"))
		{
			spellCheck();
		}
		else
			save();
		
	}
	
	void type()
	{
		for(int i=1; i<=5; i++) 
		{
			try {
				System.out.println("Typing in progress");
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem");
			}
			
			
		}
	}
	
	
	void spellCheck()
	{
		for(;;) 
		{
			try {
				System.out.println("Spell checking in progress");
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem");
			}
			
			
		}
	}
	
	
	void save()
	{
		for(;;) 
		{
			try {
				System.out.println("Saving in progress");
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem");
			}
			
			
		}
	}
}



public class MSWordExpl {

	public static void main(String[] args) {
		
		MSWord ms1 = new MSWord();
		MSWord ms2 = new MSWord();
		MSWord ms3 = new MSWord();
		
		ms1.setName("TYPE");
		ms2.setName("SC");
		ms3.setName("SAVE");
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms1.setPriority(3);
		ms2.setPriority(2);
		ms3.setPriority(1);
		
		ms1.start();
		ms2.start();
		ms3.start();
		

	}

}
