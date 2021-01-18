import java.util.*;

public class TicTacToe {
	static String [] board;
	static void printBoard() {
		System.out.println("|-----|-----|------|");
		System.out.println("|  "+board[0]+"  |  "+board[1]+"  |  "+board[2]+"   |  ");
		System.out.println("|------------------|");
		System.out.println("|  "+board[3]+"  |  "+board[4]+"  |  "+board[5]+"   |  ");
		System.out.println("|------------------|");
		System.out.println("|  "+board[6]+"  |  "+board[7]+"  |  "+board[8]+"   |  ");
		System.out.println("|-----|-----|------|");		
		
	}
	
	static void user_Move(String choice,int pos) {
		board[pos-1]=choice;
		printBoard();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		board=new String[9];
		for (int i=0;i<9;i++) {
			board[i]=""+(i+1);
		}
		printBoard();
		System.out.print("Enter 0 / X :");
		String user_choice = sc.next();
		
		String cpu_choice;
		if (user_choice=="X")
			{cpu_choice="0";}
		else
		{cpu_choice="X";}
		
		while (true){
			System.out.println("User Move : ");
			int pos = sc.nextInt();
			user_Move(user_choice,pos);
				
		}
		
		
		// TODO Auto-generated method stub

	}

}
