
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Array - > Array is a linear Data structure with homogeneous(same) values
//		int x[] = {1,2,3,4,5,6,7,8,9,10};
//		String arr[] = {"hi","hello","bye"};
//		
//		char arr1[] = {'a','b','c','d'};
		
//		String a = "abcd";
//		char p[] = a.toCharArray();
		
//		int x[];
//		x = new int[5];
//		
//		int x[] = new int[5];
//		String x[] = new String[5];
//		char x[] =  new char[10];
		
		int x[]= {0,10000,200220,34,25,26,86,4535,6787};
		int largest = x[0];
		int secondlargest = x[0];
		for (int i=0;i<x.length;i++)
		{
			if (x[i] > largest) {
				secondlargest = largest;
				largest = x[i];
			}
			
			else if (x[i] > secondlargest)
			{
				secondlargest= x[i];
			}
		}
		
		System.out.println("largest = "+largest);
		System.out.println("secondLargest = "+secondlargest);
		
//		int x[] = {12,100,1000,-1,-100,20};
//		
//		
//		for (int i=0;i<x.length;i++)
//		{
//			for (int j=i+1;j<x.length;j++)
//			{
//				if (x[i] > x[j]) {
//					int temp = x[i];
//					x[i] = x[j];
//					x[j] = temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<x.length;i++)
//		{
//			System.out.println(x[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
