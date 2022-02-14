package ncs.IOPractice;


import java.io.*;

//Deserialization



public class Deserialization {

	public static void main(String[] args) throws Exception {
		String path = "D://NCS//footballer.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		FootBaller f =(FootBaller) ois.readObject();
		System.out.println(f);
	}

}
