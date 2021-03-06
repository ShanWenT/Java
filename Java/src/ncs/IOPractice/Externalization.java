//package ncs.IOPractice;
//
//import java.io.*;
//
////class Fun
////{
////	void fun()
////	{
////		System.out.println("its fun method");
////	}
////}
//
//
////class FootBaller extends Fun implements Externalizable
//class FootBaller implements Externalizable
//{
//	//public static long serialVersionUID = 1234567810L;
//	
//	String name;
//	int age;
//	int noOfGoals;
//	
//	FootBaller(String name, int age, int noOfGoals)
//	{
//		this.name = name;
//		this.age=age;
//		this.noOfGoals = noOfGoals;
//	}
////	
////	void fun()
////	{
////	 System.out.println("this is overwridden fun method");
////	}
////	
//	public String toString()
//	{
//		return name+" "+age+" "+noOfGoals;
//	}
//@Override
//public void writeExternal(ObjectOutput out) throws IOException {
//	out.writeInt(noOfGoals);
//	out.writeObject(name);
//	
//}
//@Override
//public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//	name = (String) in.readObject();
//	noOfGoals = in.readInt();
//	
//}
//
//
//
//	
//}


package ncs.IOPractice;

import java.io.*;

class FootBaller implements Externalizable
{
	private String name;
	private	int age;
	private int noOfGoals;
	
	public FootBaller(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public int getNOG() {
		return noOfGoals;
	}

	public void setNOG(int noOfGoals) {
		this.noOfGoals=noOfGoals;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public String toString()
	{
		return name+" "+age+" "+noOfGoals;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
		
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		age = in.readInt();
		
	}
}