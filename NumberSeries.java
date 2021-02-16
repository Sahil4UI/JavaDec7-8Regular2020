
public class NumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1/2 + 1/4 +1/6 +1/8 ......
		float result=0f;
		for(float i=1f;i<=10;i++) {
			result += 1/(2*i);
		}
		System.out.println(result);
		
//		1/2 + 2/3 + 3/4

	}

}
