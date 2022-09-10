import java.util.ArrayList;
import java.util.Collections;

public class ArrayProblem {

	public static void main(String[] args) {
		
	int[] elements = {3,7,5,5,7,2,4,9,2,1};
	Logics l = new Logics();
	ArrayList al = l.removeDuplicates(elements);
	System.out.println("The new array is: "+al);
	System.out.println(Collections.max(al));
	System.out.println(Collections.min(al));
	
	System.out.println("Max value is:"+ l.findMax(al));
	
	System.out.println("Min value is:"+ l.findMin(al));

}
}