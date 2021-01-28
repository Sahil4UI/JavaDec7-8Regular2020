abstract class BankLoan{
	int amount;
	int duration;
	int id;
	BankLoan()
	{
		System.out.println("Loan class cons called");
	}
	BankLoan(int x){
		System.out.println("Loan class param called");
	}
	void guarantee() {
		System.out.println("Need Guarantee");
	}
	void docSubmit()
	{
		System.err.println("Submit doc");
	}
	void apply() {
		System.out.println("Apply for loan");
	}
	void roi()
	{
		System.out.println("ROI 7%");
	}
	
	
}

class HomeLoan extends BankLoan{
	HomeLoan(){
		super();
		System.out.println("HL default cons called");
	}
	HomeLoan(int x){
		super(100);
		System.out.println("HL param cons called");
	}
	
	@Override
	void roi() {
		System.out.println("ROI 9%");
	}
	
	void insurance() {
		System.out.println("Must have Proper insurance");
	}
	
}


class AutoLoan extends BankLoan{
	AutoLoan(){
		super();
		System.out.println("AL default cons called");
	}
	AutoLoan(int x){
		super(100);
		System.out.println("AL param cons called");
	}
	
	@Override
	void roi() {
		System.out.println("ROI 9%");
	}
	
	void insurance() {
		System.out.println("Must have Proper insurance");
	}
	
}

class LoanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoLoan obj=new AutoLoan(100);
		obj.insurance();
		obj.apply();
		obj.docSubmit();

	}

}
