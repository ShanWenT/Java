
public class StringPractice {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s1 ="java";
		String s2 ="java";
		String s3 = new String("java");
		String s= "JavaIsASimpleLanguage";
		String s5="JavaIsSimpleLanguage".toUpperCase();
		
		char ch[] = {'j','a','v','a'};
		String s4 = new String(ch);
		//if(s1==s2) // -> compare references
		//s1.equals(s2) ->compare string literals
		
		System.out.println(s);
		System.out.println("String in uppercase is: "+s.toUpperCase());
		System.out.println(s5);
		
		if(s3.equals(s4))
		{
			System.out.println("Strings are equal");
		}
		
		else {
			System.out.println("Strings are unequal");
		}
	}

}
