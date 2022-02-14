import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		String[] names = new String[5];
		names[0] = "shan";
		String[] names2= {"jane", "june","john","jennifer","joker"};
		System.out.println(names[0]);
		
		for(int i =0; i<=4; i++)
		{
			System.out.println(names2[i]);
		}
		
		
		int[][] twodimension= {{1,2,3},{4,5,6},{7,8,9}};
		 for(int i=0; i<twodimension.length; i++) 
		 {
			 for(int j=0; j<twodimension.length; j++) {
				 
				 System.out.print(twodimension[i][j]+" ");
			 }
			 
			 System.out.println( );
		 }
		 

		 
		int ar[] = new int[2];
		System.out.println(ar[0]);
 		 
		System.out.println(Arrays.toString(names2));
		System.out.println(Arrays.deepToString(twodimension));
		
		int[] ar2= {10,1,5,7,6,8,20,100};
		Arrays.parallelSort(ar2);
		System.out.println(Arrays.toString(ar2));
		System.out.println(Arrays.equals(ar, ar2)); // check if the values of both arrays is the same
		System.out.println(ar.equals(ar2)); // check address is the same for both arrays
		
		List<Integer> games = Arrays.asList(1,2,3,4);
		System.out.println(Arrays.toString(games.toArray()));
		for(int i = 0; i<games.size(); i++)
		{
			System.out.println(games.get(i));
		}
		
		for(int game : games) { // foreach loop
			System.out.println(game);
		}
	}

	
}
	

