package com.ncs.Multithreads;

import java.util.Scanner;


class Demo extends Thread
{
	public void run() {
		System.out.println("Banking activity started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the acno");
		int an = sc.nextInt();
		System.out.println("Enter the password");
		int pw = sc.nextInt();
		System.out.println("Collect money");
		System.out.println("Banking activity ended");
	}
}

class Demo2 extends Thread
{
	public void run() {
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
}

class Demo3 extends Thread{
	public void run() {
		System.out.println("Addition activity started");
		int a=1234567;
		int b=7654321;
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition activity ended");
	}
}

public class STOS {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main activity started");
		Demo d = new Demo();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d.start();
		d2.start();
		d3.start();
		
		d.join();
		d2.join();
		d3.join();
		
		System.out.println("Main activity ended");
		
		
		
		

	}

}
