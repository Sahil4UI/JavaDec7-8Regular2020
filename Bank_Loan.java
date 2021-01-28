class Loan{
	int amount;
	int duration;
	int id;
	Loan(){
		System.err.println("Defualt cons called");
	}
	
	Loan(int x){
		this();
		System.err.println("param cons called");
	}
	
	Loan(int x,int y){
		this(x);
		System.err.println("param cons called");
	}
}
public class Bank_Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan obj = new Loan(15,16);
		
		
	}

}
