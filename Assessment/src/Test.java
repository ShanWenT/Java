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
		int globalCount = input.length();
		for(int mid = 1; mid<input.length()-1; mid++)
		{
			count = 0;
			
			int low=mid -1;
			int high = mid+1;
			
			while(low >=0 && high <input.length()&& input.charAt(low--) == input.charAt(high++))
				count++;
			
			globalCount += count;
			count =0;
			
			low = mid-1;
			high=mid;
			while(low >=0 && high <input.length() && input.charAt(low--)== input.charAt(high++))
				count++;
			
			globalCount += count;
		}
		System.out.println(globalCount);
		}
		

	}

