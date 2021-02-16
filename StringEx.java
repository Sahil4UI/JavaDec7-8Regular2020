import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String x = "Welcome";
//		String res = "";
//		
//		for (int i=x.length()-1;i>=0;i--)
//		{
//			res += x.charAt(i);
//		}
//		
//		System.out.println(res);

		
//		String x = "aaaeeeiiiuuu1123454656";
//		String res = "";
//		
//		for (int i=0;i<x.length();i++)
//		{
//			if (!res.contains(""+x.charAt(i)))
//			{
//				res += x.charAt(i);
//			}
//		}
//		System.out.println(res);
//		
		String x = "Java Programming";
		String res="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character to delete : ");
		char a = sc.next().charAt(0);
		for (int i=0;i<x.length();i++)
			{
				if (! (x.charAt(i) == a))
				{
					res += x.charAt(i);
				}
			}
		System.out.println(res);
			
		
		
		
		
//		int vowelsCount=0;
//		String vow = "aeiouAEIOU";
//		
//		for (int i=0;i<x.length();i++)
//		{
//			if (vow.contains(""+x.charAt(i)))
//			{
//				vowelsCount++;
//			}
//		}
//		System.out.println(vowelsCount);
	
	
	}

}
