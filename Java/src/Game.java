import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		}
	
	static void display(char board[][])
	{
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=4; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	static void insert(char board[][], int pos, char cp)
	{
		if(cp=='X')
		{
			TicTacToeGame.allUserPos.add(pos);
		}
		else {
			TicTacToeGame.allCpuPos.add(pos);
		}
		
		switch(pos)
		{
		case 1: board[0][0]=cp;
		break;
		case 2: board[0][2]=cp;
		break;
		case 3: board[0][4]=cp;
		break;
		case 4: board[2][0]=cp;
		break;
		case 5: board[2][2]=cp;
		break;
		case 6: board[2][4]=cp;
		break;
		case 7: board[4][0]=cp;
		break;
		case 8: board[4][2]=cp;
		break;
		case 9: board[4][4]=cp;
		break;
		
		default: System.out.println("Invalid Position");
		}
	}
	
	static void checkWinner()
	{
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List leftCol= Arrays.asList(1,4,7);
		
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List diag1 = Arrays.asList(1,5,9);
		List diag2= Arrays.asList(3,5,7);
		
		List<List> winCon = new ArrayList();
		winCon.add(topRow);
		winCon.add(midRow);
		winCon.add(botRow);
		winCon.add(leftCol);
		winCon.add(midCol);
		winCon.add(rightCol);
		winCon.add(diag1);
		winCon.add(diag2);
		
		for(List l : winCon)
		{
			if(TicTacToeGame.allUserPos.containsAll(l))
			{
				if(TicTacToeGame.allUserPos.containsAll(l) && TicTacToeGame.noOfPlayers==1) {
					System.out.println("User1 is the winner");
					System.exit(0);
				}
				else {
					System.out.println("User is the winner");
					System.exit(0);
				}
				
				
			}
			else if(TicTacToeGame.allCpuPos.containsAll(l))
			{
				if(TicTacToeGame.allCpuPos.containsAll(l) && TicTacToeGame.noOfPlayers==1) {
					System.out.println("Player 2 is the winner");
					System.exit(0);
				}
				else {
					System.out.println("CPU is the winner");
					System.exit(0);
				}
				
			}
			
			else if(TicTacToeGame.allUserPos.size()+TicTacToeGame.allCpuPos.size()==9)
			{
				System.out.println("Its a draw");
				System.exit(0);
			}
		}
	}

	
}
