
public class StringPractice2 {

	public static void main(String[] args) {
		String s1= "Java is a programming language";
		String s2= "It is a simple programming language";

		StringBuffer sb1 = new StringBuffer();
		
		System.out.println(sb1.capacity());
		
		sb1.append("Tommy");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		sb1.append("is a Java programmer");
		System.out.println(sb1);
	}

}
