

public class Test2 {
	
	
	public static void main(String[] args) {
		String input ="Bravo      aka      bob     has    racecar";
		int count=0;
		boolean word = false;
		
		

		///////////////////////////////////////
		for(int a=0; a<input.length()-1; a++)
		{
			
			if(word!=true)
			{
				if(input.charAt(a)==' ') 
				{
					count++;
					word=true;
				}
				
			}
			
			if(input.charAt(a)!=' ') 
			{
				word=false;
			}
			
		}
		
		System.out.println("total number of words" + count+1);
	/////////////////////////////////////////////////
		
		int index =0;
		char[] rev = {};
		
		for(int b=5; b>0; b--) {
			
			for(int c=0; c<input.length(); c++)
			{
				
				rev[c]=input.charAt((input.length()-(c+1)));
				
				
				
			}
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}