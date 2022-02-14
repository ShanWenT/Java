import java.util.Scanner;

class Guesser{
	int gNum;
	int genNum()
	{
		System.out.println("Guesser guess a number:");
		Scanner sc = new Scanner(System.in);
		gNum= sc.nextInt();
		return gNum;
	}
}

class Player{
	int pNum;
	int genNum()
	{
		System.out.println("Player guess a number:");
		Scanner sc = new Scanner(System.in);
		pNum= sc.nextInt();
		return pNum;
	}
}

class Umpire
{
	int noFromGuesser;
	int noFromP1;
	int noFromP2;
	int noFromP3;
	
	void askGuesser()
	{
		Guesser g= new Guesser();
		noFromGuesser = g.genNum();
	}
	
	void askPlayers()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		noFromP1=p1.genNum();
		noFromP2=p2.genNum();
		noFromP3=p3.genNum();
	}
	void compare()
	{
		if(noFromGuesser == noFromP1 && noFromGuesser == noFromP2 && noFromGuesser== noFromP3)
		{
			System.out.println("All 3 Guessed correctly");
		}
		else if(noFromGuesser == noFromP1 && noFromGuesser == noFromP2)
		{
			System.out.println("only P1 and P2 guessed correctly");
		}
		else if(noFromGuesser == noFromP1 && noFromGuesser == noFromP3)
		{
			System.out.println("only P1 and P3 guessed correctly");
		}
		else if(noFromGuesser == noFromP2 && noFromGuesser == noFromP3)
		{
			System.out.println("only P2 and P3 guessed correctly");
		}
		else if(noFromGuesser == noFromP1)
		{
			System.out.println("Player 1 is the winner");
		}
		else if(noFromGuesser == noFromP2)
		{
			System.out.println("Player 2 is the winner");
		}
		else if(noFromGuesser == noFromP3)
		{
			System.out.println("Player 3 is the winner");
		}
		else
		{
			System.out.println("Its a draw. No one guessed it correctly");
		}
	}
}


public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.askGuesser();
		u.askPlayers();
		u.compare();
	}

}
