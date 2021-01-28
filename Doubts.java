
public class Doubts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x[][] = new int[3][3];
		int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int j=2;
		int i=0;
		for (i=0;i<2;i++) {
			if (i <=j)
			{
				System.out.println(x[i][j]);
			}
			
			j--;		}
		System.out.println(x[i][j]);
	}

}
