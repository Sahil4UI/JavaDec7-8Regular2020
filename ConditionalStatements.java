
public class ConditionalStatements {
	public static void main(String[] args) {
//		check wether no is even or odd
		int number =15 ;
//		if (number%2==0)
//			{
//			 System.out.println("Even Number");	
//			}
//		else {
//			System.out.println("odd number");
//		}
		
//		if (number % 2==0)
//		{
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
		
		
//		
		int a,b,c;
		a=0;
		b = -98;
		c = 100;
		if (a+b>c && b+c>a && c+a>b)
		{
			if (a==b && b==c && c==a)
			{
				System.out.println("Equilateral ");
			}
			else if (a==b || b==c || c==a)
			{
				System.out.println("Isoceles Traingle");
			}
			else {
				System.out.println("Scalene Traingle");
			}
		}
		else {
			System.out.println("invalid traingle");
		}
		
//		
//		if (a>b && a>c){
//			System.out.println("A is greator");
//		}
//		else if(b>c)
//		{System.out.println("B is greator");
//		
//		}
//		else {
//			System.out.println("C is greatest");
//		}
}
}
