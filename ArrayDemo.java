public class ArrayDemo {
    public static void main(String[] args) {
        // int array[]={1,2,3,4,5};
        // int arr[] = new int[10];
        // int arr[]; //Declaration
        // arr = new int[10]; //initialization

        // for (int i=0;i<arr.length;i++)
        // {
        //     arr[i] = i+1;
        // }

        // for (int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]);
        // }
        
//         int x[] = {99,-100,54,34,23,67,89,56,45};
//         int choice=  20;
//         int found=0;
//         for (int i=0;i<x.length;i++)
//         {
//             if (choice == x[i])
//             {   
//                 found=1;
//                 break;
//             }
//             else{
//                 found=0;

//             }
//         }

// if(found==1)
// {
//     System.out.println("found");

// }
// else{
//     System.out.println("not found");

// }





        // int largest = x[0];
        // for (int i=0;i<x.length;i++)
        // {
        //     if (x[i] > largest)
        //     {
        //         largest = x[i];
        //     }
        // }
        // System.out.println(largest);

    int x[] ={1,1,2,3,3,3,4,4,5,6};
    int y[] =new int[x.length];

   

    for (int i=0;i<x.length;i++)
    {
        int c=1;
        for (int j=i+1;j<x.length;j++)
        {
            if(x[i]==x[j])
            {
                c++;
            }
        }
        System.out.println(c);
    }

    // ritika.ishasingh@gmail.com





    }
}
