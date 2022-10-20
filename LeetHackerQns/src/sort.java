import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sort {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>(Arrays.asList(1,5,3,3,2,4));
		
		System.out.println(number);
		System.out.println(sort(number)); 

	}
	
	static List<Integer> sort(List<Integer> number){
		HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
		List<Integer> newNumber = new ArrayList<Integer>();
	
		
		
		for(int i=0; i<number.size(); i++) {
			int counter=0;
			for(int j=0; j<number.size(); j++) {
				if(number.get(i)==number.get(j))
				{
					counter++;
				}
			}
			freq.put(i, counter);
		}
		System.out.println(freq);
		
		int smallestValue=0;
		for(int i=0; i<freq.size(); i++) {
			smallestValue = freq.get(i);
			for(int j=1; j<freq.size()+1; j++) {
				if(freq.get(j)<smallestValue){
					smallestValue = freq.get(j);
				}
					
			}
					
		}
		newNumber.add(number.get(smallestValue));
		freq.remove(smallestValue);
		
		
		
		return newNumber;
	}

}
