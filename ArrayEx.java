import java.util.ArrayList;
class ArrayEx {
    public static void main(String[] args) {
        // int x[] = {1,2,-990,43,76,843,345,67,343,32};
        // int temp=0;
        // for (int i=0;i<x.length;i++)
        // {
        //     for (int j=i+1;j<x.length;j++)
        //     {
        //         if (x[i]>x[j])
        //         {
        //             temp = x[i];
        //             x[i]=x[j];
        //             x[j]=temp;
        //         }
        //     }
        // }

        // for (int k:x)
        // {
        //     System.out.print(k+" ");
        // }
            int [] k ={1,2,2,3,3,4,5,5,5};
            ArrayList<Integer> x = new ArrayList<Integer>();
            for (int a:k)
            {
                if (!x.contains(a))
                {
                    x.add(a);
                }
            }

            System.out.println(x);

    }
}
