
public class Doubts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x[][] = {{1,2},{4,5}};
    int res[][]= new int[2][2];
	for (int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
				res[i][j] = x[j][i];
				System.out.print(res[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	
	}

}
