
public class LoopExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int result=0;
//		for (int i=1253;i>0;i=i/10)
//		{
//			int rem = i%10;
//			result += rem;
//			
//		}
//		System.out.println("Result = "+result);

//		for (int i=1;i<=10000;i++)
//		{
//			System.out.println(i);
//			if (i ==5)
//			{
//				break;
//			}
//		}
		
//		int num = 9;
//		boolean isPrime = false;
//		for(int i=2;i<num;i++)
//		{
//			if (num%i==0)
//			{
//			 isPrime =false;
//			 break;
//			}
//			else {
//				isPrime=true;
//			}
//		}
//		
//		System.out.println((isPrime == true)?"Prime":"Not Prime");
	
			int x = 125;
			int res=0;
			for (int i=x;i>=0;i=i/10)
			{
				int rem = i%10;
				res = res + rem;
				
			}
			System.out.println(res);
	}
	
	

}


