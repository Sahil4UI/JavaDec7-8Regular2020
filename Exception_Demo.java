import java.util.Scanner;

public class Exception_Demo {

	public static void main(String[] args) {
		try {
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number 1 : ");
		int x=sc.nextInt();
		System.out.print("Enter Number 2 : ");		
		int y=sc.nextInt();
		sc.close();
		System.out.println("sum = "+(x+y));
		System.out.println("div = "+(x/y));
		System.out.println("mul = "+(x*y));
		System.out.println("sub = "+(x-y));
//		int x[] = {1,2,3,4,51};
//		System.out.println(x[51]);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally block");
		}
	}

}
