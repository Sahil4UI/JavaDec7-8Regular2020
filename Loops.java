
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		loops - repetition
//		for loop
//		while loop
//		do while loop
//		for loop
//		for (int i=1;i<=10;i++) {
//			System.out.println(i*2);
//		}

		
//		for (int i=2;i<=20;i=i+2) {
//			System.out.println(i);
//		}
		
//		int sum=0;
//		for (int i=1;i<=10;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);

//		Fibonacci series 0 1 1 2 3 5......
		int First = 0;
		int Second=1;
		System.out.println(First+"\n"+Second);
		
		for(int i =1;i<=8;i++)
		{
			int Third = First+Second;
			System.out.println(Third);
			First = Second;
			Second = Third;
		}
//		H.W
//		1.Find the sum of digits of Number 123->1+2+3=6
//		2. find the reverse of number 123 -> 321
	}

}
