import java.util.Scanner;
public class Iteration {
	public static void main(String[] args) {
		
//		print no from 1 to 10
//		for (int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//		}
//		print 10 to 1 
//		for (int i=10;i>=1;i--)
//		{
//			System.out.println(i);
//		}
		
//		for (int i=1;i<=10;i++)
//		{
//			System.out.println("2 X "+i+"="+2*i);
//		}
		
//		for (int i=2;i<=20;i=i+2)
//		{
//			System.out.println(i);
//		}
//		for (int i=1;i<=20;i++)
//		{
//			if (i%2==0)
//			{
//				System.out.println(i);
//			}
//		}
		
//		int result=0;
//		for (int i=1;i<=10;i++)
//		{
//			result+=i;
//		}
//		System.out.println(result);
		
//		int isPrime = 1;
//		
//		for (int i=2;i<=x-1;i++)
//		{
//			if (x%i==0)
//			{
//				isPrime = 0;
//				break;
//			}
//		}
//		
//		if (isPrime == 1)
//		{
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("Not Prime");
//		}
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number : ");
		int x = obj.nextInt();
		int temp = x;
		
		int result = 0;
		
		for (int i=1;x>0;x = x/10)
		{
			int rem = x%10;
			result=result+rem*rem*rem;
		}
		
		if (temp == result)
		{
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}

	}
}
