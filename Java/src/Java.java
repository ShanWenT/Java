
public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=1; j<=5; j++)
		{
			for(int a=5; a>=j; a--)
			{
				System.out.print(" ");
			}
			
			for(int b=1; b<=j; b++)
			{
				if(j==5||b==j||b==1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int c=1; c<=5; c++)
			{
				System.out.print(" ");
			}
			for(int d=1; d<=j; d++)
			{
				if(d==1||j==5||d==j) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
		for(int j=1; j<=5; j++)
		{
			for(int i=1; i<=6; i++)
			{
				System.out.print(" ");
			}
			
			for(int c=1; c<=5; c++)
			{
				if(c==1||c==5||j==1||j==5)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for(int j=1; j<=5; j++)
		{
			for(int a=1; a<=j; a++)
			{
				System.out.print(" ");
			}
			
			for(int b=5; b>=j; b--)
			{
				if(b==5||j==1||b==j)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int c=1; c<=5; c++)
			{
				System.out.print(" ");
			}
			for(int d=5; d>=j; d--)
			{
				if(j==1||d==5||j==d)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
