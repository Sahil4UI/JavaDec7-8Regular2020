
public class RecursiveFunction {
	
//	public static void Print(int x) {
//		//base case
//		if (x>10)
//		{
//			return ;
//		}
//		
//		System.out.println(x);
//		Print(x+1);
//	}
	
//	public static int fib(int x)
//	{
//		
//		if (x==1)
//			{return 1;}
//		
//		
//		
//		return x*fib(x-1);
//	}
//	public static int Power(int x,int y)
//	{
//		
//		if (y==1)
//			{return x;}
//		
//		
//		
//		return x*Power(x,y-1);
	
	public static int SOD(int x) {
		
		if (x==0)
		{
			return 0;
		}
		
		int rem = x%10;
		
		return rem+SOD(x/10);
	}
	
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Print(1);
		int res= SOD(125);
		System.out.println(res);
	}

}
