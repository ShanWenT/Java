package ncs.IOPractice;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.*;
public class FirstIO {

	public static void main(String[] args) throws IOException {
		
		
		String input = "D://NCS//input.txt";
		String output = "D://NCS//output.txt";
		
//		FileInputStream fis = new FileInputStream(input);
//		FileOutputStream fos = new FileOutputStream(output);
		FileReader fr = new FileReader(input);
		FileWriter fw = new FileWriter(output);
		
		//to enhanced the speed of execution
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw); 
		
		int temp;
		while((temp=br.read())!=-1) 
		{
			bw.write(temp);
			
		}
		bw.flush();
		//fw.flush();
	//////////////////////////////////////////////////////////
		File myFile = new File("D://NCS//test.txt");
		
		try {
			if(myFile.createNewFile()) 
			{
				System.out.println("File created: " + myFile.getName());
			} else 
			{
				System.out.println("File already exists.");
			}	
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
		System.out.println(myFile.length()); // type:long, return size of file in bytes
		System.out.println(myFile.canRead()+" "+myFile.canWrite()+" "+myFile.exists());
		System.out.println(myFile.getAbsolutePath()+" "+myFile.getName());
		try 
		{
			FileWriter fw2 = new FileWriter(myFile);
			fw2.write("test 1 2 3");
			fw2.close();
			System.out.println("Successfully wrote to the file");
		}
		catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
