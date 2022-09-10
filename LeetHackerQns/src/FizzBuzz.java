
import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		// create a variable and assign 30
		int var = 30;
		// create a arrayList of string
		ArrayList<String> output = new ArrayList<String>();
		
		// create a for loop from index 1 to variable
		for(int i =1; i<=var; i++) {
			
			
			if(i%3==0 && i%5!=0) {
				output.add("fizz");
//				System.out.println("fizz");
			}
			else if(i%3!=0 && i%5==0) {
//				System.out.println("buzz");
				output.add("buzz");
			}
			else if(i%3==0 && i%5==0) {
				output.add("fizzbuzz");
//				System.out.println("buzzfizz");
			}
			else {
				
//				System.out.println(i);
				output.add("i");
			}
			
		}
		System.out.println(output.toString());
		
		
		System.out.println(1+2+3+"welcome"+5+6);
		
		// if else statement if index has no remainder for 3 but 5 then print fizz
		// else if check if index has no remainder for 5 but 3 then print buzz
		// else if index has no remainder for both 3 & 5 print fizzbuzz
		// else print the index

	}

}
