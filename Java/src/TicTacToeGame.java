import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

	static ArrayList allUserPos = new ArrayList();
	static ArrayList allCpuPos = new ArrayList();
	static int noOfPlayers;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many players are playing? Select 1 or 2: ");
		noOfPlayers = sc.nextInt();
		
		char board[][] = {
				{ ' ','|',' ','|',' '},
				{ '-','+','-','+','-'},
				{ ' ','|',' ','|',' '},
				{ '-','+','-','+','-'},
				{ ' ','|',' ','|',' '}
				};
		
		Game.display(board);
		
		
		while(true) 
		{
			System.out.println("Enter your position(1-9): ");
			int userPos = sc.nextInt();
			while(allUserPos.contains(userPos)||allCpuPos.contains(userPos)) {
				System.out.println("Position is already taken");
				userPos = sc.nextInt();
			}
			Game.insert(board,userPos,'X');
			Game.display(board);
			Game.checkWinner();
		
			if(noOfPlayers==1) 
			{
				
				System.out.println("Enter your position(1-9): ");
				int user2Pos = sc.nextInt();
				while(allUserPos.contains(user2Pos)||allCpuPos.contains(user2Pos)) {
					System.out.println("Position is already taken");
					user2Pos = sc.nextInt();
				}
				System.out.println("User2 Pos: "+user2Pos);
				Game.insert(board,user2Pos,'O');
				Game.display(board);
				Game.checkWinner();
				
			}
			
			else {
				Random r = new Random();
				int cpuPos = r.nextInt(9)+1;
				while(allUserPos.contains(cpuPos)||allCpuPos.contains(cpuPos)) {
					System.out.println("Position is already taken");
					cpuPos = r.nextInt(9)+1;
				}
				System.out.println("Computer Pos: "+cpuPos);
				Game.insert(board,cpuPos,'O');
				Game.display(board);
				Game.checkWinner();
			}
			
			
			
		}
		
		
		
		
	}

}
