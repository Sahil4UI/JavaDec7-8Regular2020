import java.util.Scanner;

public class Nested_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		for (int i=1;i<=3;i++)
//		{
//			for (int j=1;j<=3;j++)
//			{
//				System.out.println("i="+i+",j="+j);
//			}
//		}
		
		
//		for (int i=1;i<=3;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.println("i="+i+",j="+j);
//			}
//		}
		
		
//		#print prime no. b/w 1-100
//		boolean isPrime = false;
//		for (int i=2;i<=100;i++)
//		{
//			for (int j=2;j<i;j++)
//			{
//				if (i%j==0)
//				{
//					isPrime = false;
//					break;
//				}
//				else {
//					isPrime = true;
//				}
//				
//				
//			}
//			if ( i==2 || isPrime == true)
//			{
//				System.out.println(i);
//			}
//		}
		
//		int x=1;
//		for (int i=1;i<=5;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print(x);
//				x++;
//			}
//			System.out.println();
//			
//		}
		
		
//		for (int i=1;i<=5;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
//		for (int i=1;i<=5;i++)
//		{
//			for (int k=1;k<=5-i;k++)
//			{
//				System.out.print(" ");
//			}
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int row = sc.nextInt();
		sc.close();
		for (int i=1;i<=row;i++ )
		{
			int x = i;
			for (int j =i;j>=1;j--)
			{
				System.out.print(x+"     ");
				x += row;
			}
			System.out.println();
		}

	}

}






























