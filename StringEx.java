
import java.util.Scanner;
class StringEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  YOur String :");
        String x = sc.nextLine();
        sc.close();
        int count[]= new int[256];

        for (int i=0;i<x.length();i++)
        {   
            count[x.charAt(i)]++;
        }
        int max=-1;
        char result=' ';

        for(int i=0;i<count.length;i++){
            if (max < count[i])
            {
                max =count[i];
                result = (char) i;
            }

    }
    System.out.print(result);
        // for (int i=0;i<x.length();i++)
        // {   
        //     if (!res.contains(""+x.charAt(i))){
        //         res+=x.charAt(i);
        //     }
        // }
        // System.out.println(res);
        
        // int v_count = 0;
        // int c_count=0;
        // int digitCount=0;
        // int special=0;
        // String vowels = "aeiouAEIOU";
        // for (int i=0;i<x.length();i++)
        // {
        //     if ((x.charAt(i) >= 'a' || x.charAt(i) >= 'A') && (x.charAt(i) <= 'z' || x.charAt(i) <= 'Z'))
        //     {  String a = ""+x.charAt(i);
        //         if (vowels.contains(a))
        //         {++v_count;}
        //         else{++c_count;}
        //     }
        //     else if(x.charAt(i)>='0' && x.charAt(i)<='9')
        //     {
        //         ++digitCount; }
        //     else{++special;}
        // }
        // System.out.println("Vowels Count :"+v_count);
        // System.out.println("const count :"+c_count);
        // System.out.println("digit count :"+digitCount);
        // System.out.println("special count :"+special);

        // String res = "";
        // // ritika - 5-0

        // for (int i=x.length()-1;i>=0;i--)
        // {
        //     res += x.charAt(i);
        // }

        // System.out.println(res);
    }
    }
