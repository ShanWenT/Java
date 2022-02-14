
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1; j<=5; j++)
		{
			
			
			for(int i=1; i<=5; i++)
			{
				if(j==1 ||i==5 || i==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			
			
			System.out.println();
		}
	}

}
