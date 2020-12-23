class two_D_Array
{
    public static void main(String[] args) {
        int x[][] = {  {1,2},{4,5}  };
        int y[][] = {  {1,2,},{4,5} };
        int n = 2;
        int result[][] = new int[n][n];
        int i,j,k;
        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                result[i][j]=0;
                for (k=0;k<n;k++)
                {
                    result[i][j] = result[i][j] + x[i][k]*y[k][j]; 
                }
            }
        }


        // for (int i=0;i<3;i++)
        // {
        //     for(int j=0;j<3;j++)
        //     {
        //         if (i>=j)
        //         {
        //             System.out.print(x[i][j]+" ");
        //         }
        //         else{
        //             System.out.print("  ");
    
        //         }
        //     }
        //     System.out.println();
        // }

    }
}