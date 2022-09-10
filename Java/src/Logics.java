import java.util.ArrayList;

public class Logics implements Program {

	public ArrayList removeDuplicates(int ar[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			if(al.contains(ar[i])==false)
			{
				al.add(ar[i]);
			}
		}
		return al;
	}
	
	public int findMax(ArrayList al)
	{
		int max = (int) al.get(0);
		for(int i=1; i<=al.size()-1; i++)
		{
			if((int)al.get(i)>max) {
				max=(int) al.get(i);
			}
		}
		return max;
	}
	
	
	public int findMin(ArrayList al) 
	{
		int min = (int) al.get(0);
		for(int i=1; i<=al.size()-1; i++)
		{
			if((int)al.get(i)<min) {
				min=(int) al.get(i);
			}
		}
		return min;
	}
}
