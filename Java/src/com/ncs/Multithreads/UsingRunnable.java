package com.ncs.Multithreads;

import java.util.Scanner;


class Test1 implements Runnable
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

class Test2 implements Runnable
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

class Test3 implements Runnable
{
	public void run() {
		System.out.println("Addition activity started");
		int a=1234567;
		int b=7654321;
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition activity ended");
	}
}

public class UsingRunnable {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
		
		

	}

}
