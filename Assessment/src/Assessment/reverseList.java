package Assessment;
import java.util.ArrayList;
import java.util.List;

public class reverseList {
	
	
	public static void main(String[] args) {
	
	List<Integer> arr = new ArrayList<>();
	{
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		
		List<Integer> arrN = new ArrayList<>();
		
		int j=arr.size()-1;
		for(int i=j; i>=0; i--) {
			 arrN.add(arr.get(i));
		}
		
		System.out.println(arrN);
	}
	
	
	

}
}