
public class throws_Demo {

	static void myFuncton() throws ArithmeticException{
		System.out.println("hello everyone");
		int x = 10/0;
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		myFuncton();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
