
public class ExceptionDemo1 {

	static void vote(int age) {

		if (age <18) {
			throw new ArithmeticException("Invalid Age");
		}
		else {
			System.out.println("welcome voter");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		vote(17);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
