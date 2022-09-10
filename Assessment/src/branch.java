import java.util.ArrayList;

public class branch {

	public static void main(String[] args) {
		
		
		
		
		ArrayList<Integer> branch = new ArrayList<>();
		ArrayList<Integer> nBranch = new ArrayList<>();
		branch.add(50);
		branch.add(10);
		branch.add(20);
		branch.add(3);
		branch.add(30);
		branch.add(2);
		branch.add(300);
		branch.add(500);
		int smallestBranchLength=branch.get(0);
		int smallestBranchIndex=0;
		
		for(int i=1; i<branch.size(); i++) {
			
			if(branch.get(i)<smallestBranchLength) {
				smallestBranchLength = branch.get(i);
				smallestBranchIndex = i;
			}		
		}
		nBranch.add(smallestBranchLength);
		
		for(int j=0; j<branch.size(); j++)
		{	if(j!=smallestBranchIndex) {
			int newBranchLength = branch.get(j)-smallestBranchLength;
			nBranch.add(newBranchLength);
		}
			
		}
		
		System.out.println(nBranch);
	

	}

}
