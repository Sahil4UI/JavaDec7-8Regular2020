import java.util.*;

public class TicTacToe {
	static String [] board;
	static String combinations[][]= {{"1","2","3"},{"4","5","6"},{"7","8","9"},{"1","4","7"},{"2","5","8"},{"3","6","9"},{"1","5","9"},{"3","5","7"}}; 
	static void printBoard() {
		System.out.println("|-----|-----|------|");
		System.out.println("|  "+board[0]+"  |  "+board[1]+"  |  "+board[2]+"   |  ");
		System.out.println("|------------------|");
		System.out.println("|  "+board[3]+"  |  "+board[4]+"  |  "+board[5]+"   |  ");
		System.out.println("|------------------|");
		System.out.println("|  "+board[6]+"  |  "+board[7]+"  |  "+board[8]+"   |  ");
		System.out.println("|-----|-----|------|");		
		
	}
	
	static String user_Move(String choice,int pos) {
		board[pos-1]=choice;
		printBoard();
		return checkWinner(pos,choice);
		
		
	}
    static String checkWinner(int pos, String choice) {

		String win = "";
    	for(int i=0;i<8;i++)
		{
			for(int j=0;j<3;j++)
			{
				if ((""+pos).equals(combinations[i][j]))
				{
					combinations[i][j]=choice;
				}
			}
			
		}
			for(int a=0;a<8;a++)
			{
				
				
					if(combinations[a][0].equals(choice) && combinations[a][1].equals(choice) && combinations[a][2].equals(choice) )
					{
					return "Winner";
				}
			}
		
			return " ";
	
		
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
			String res=user_Move(user_choice,pos);
			System.out.println(res);
		}
		
		
		// TODO Auto-generated method stub

	}

}
