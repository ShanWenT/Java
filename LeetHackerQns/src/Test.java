import java.util.ArrayList;

public class Test {

	
	// write java program to check number of words in a string and number of palindromes in a string
	public static void main(String[] args) {
		String input ="Bravo 		aka 		bob		has 		racecar";
		ArrayList<String> al = new ArrayList<String>();
		int count = 0;
		int i=0;
		
		String newInput = input.replaceAll("\\s{2,}"," ");
		System.out.println(newInput);
		

		
		// number of words in a string
		while(i<newInput.length())
		{
			if(newInput.charAt(i) == ' ')
			{
				++count;
			}
			
			++i;
		}
		count+= 1;
		
		System.out.println("No of words: " + count);
		
		
		//number of palindrome
		
		}
		

	}

