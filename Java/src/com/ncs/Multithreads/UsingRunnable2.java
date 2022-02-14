package com.ncs.Multithreads;

import java.util.Scanner;


class Demo5 implements Runnable // using extends Thread works the same
{
	public void bank() {
		System.out.println("Banking activity started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the acno");
		int an = sc.nextInt();
		System.out.println("Enter the password");
		int pw = sc.nextInt();
		System.out.println("Collect money");
		System.out.println("Banking activity ended");
	}



	public void print() {
		System.out.println("Printing activity started");
		for(int i=1; i<=5; i++) 
		{
			try {
				System.out.println("Hello all!");
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem");
			}
			
			
		}
		System.out.println("Printing activity ended");
	}



	public void add() {
		System.out.println("Addition activity started");
		int a=1234567;
		int b=7654321;
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition activity ended");
	}


	public void run()
	{
		if(Thread.currentThread().getName().equals("BANK"))
		{
			bank();
		}
		else if(Thread.currentThread().getName().equals("PRINT"))
		{
			print();
		}
		else
			add();
	}
}
public class UsingRunnable2 {

	public static void main(String[] args) {
		
		Demo5 d5 = new Demo5();
		
		Thread th1 = new Thread(d5);
		Thread th2 = new Thread(d5);
		Thread th3 = new Thread(d5);
		
		th1.setName("BANK");
		th2.setName("PRINT");
		th3.setName("ADD");
		
		th1.start();
		th2.start();
		th3.start();
		
		
		
		
		
		
		
		

	}

}

