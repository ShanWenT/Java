package InterfaceExmp;

import java.util.Scanner;

abstract class Shape
{
	float area;
	abstract void input();
	abstract void cal();
	void disp()
	{
		System.out.println("The area is: " + area);
	}
}

class Rectangle extends Shape
{
	float l,s;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter the length");
		l = sc.nextInt();
		System.out.println("Enter the side");
		s=sc.nextInt();	
	}
	
	void cal()
	{
		area = l*s;
	}
	
}

class Square extends Shape
{
	float l;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter the length");
		l = sc.nextInt();
		
	}	
	void cal()
	{
		area = l*l;
	}
	
}

class Circle extends Shape
{
	float r, pi=3.14f;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter the radius");
		r = sc.nextInt();
		
	}	
	void cal()
	{
		area = pi*r*r;
	}
	
}
public class LaunchShape {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Square s= new Square();
		Circle c = new Circle();
		r.input();
		r.cal();
		r.disp();
		s.input();
		s.cal();
		s.disp();
		c.input();
		c.cal();
		c.disp();

	}

}
