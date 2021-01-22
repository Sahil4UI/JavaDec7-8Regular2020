class Account{
	int id;
	String name;
	double balance;
	void deposit() {
		System.out.println("money deposited");
	}
	
	
	void withdraw() {
		System.out.println("money withdrawn");
	}
	void show()
	{
		System.out.println("NAME : "+name);
	}
}

class CurrentAccount extends Account{
	void withdraw() {
		super.withdraw();
		System.out.println("SA withdraw limit");
	}
	void limit() {
		System.out.println("limit is 50K");
	}
	void roi()
	{
		System.out.println("ROI 3%");
	}
}

class SavingAccount extends Account{
	void withdraw() {
		super.withdraw();
		System.out.println("SA withdraw limit");
	}
	void limit() {
		System.out.println("limit is 50K");
	}
	void roi()
	{
		System.out.println("ROI 3%");
	}
	
}

public class ISA {
	public static void main(String[] args) {
		SavingAccount ram= new SavingAccount();
		ram.name="RAM";
		ram.show();
		ram.deposit();
		ram.withdraw();
		ram.roi();
		ram.limit();
		
		System.out.println("*****");
		
		CurrentAccount shyam= new CurrentAccount();
		shyam.name="shyAM";
		shyam.show();
		shyam.deposit();
		shyam.withdraw();
		shyam.roi();
		shyam.limit();
	}
}
