package ncs.IOPractice;


import java.io.*;

//Serialization Process


public class Serialization {

	public static void main(String[] args) throws Exception {
		
		//For Serialization
		//FootBaller fb1 = new FootBaller("Tommy", 25, 10);
		
		//For Externalization
		FootBaller fb1 = new FootBaller();
		fb1.setAge(25);
		fb1.setName("Tommy");
		fb1.setNOG(10);
		///////////////////////////////////
		
		String path ="D://NCS//footballer.txt";
		
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(fb1);
		System.out.println("Object stored in harddisk");

	}

}
