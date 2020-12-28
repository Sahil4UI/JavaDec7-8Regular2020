
import java.util.Scanner;
class StringEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  YOur String :");
        String x = sc.nextLine();
        int v_count = 0;
        int c_count=0;
        String vowels = "aeiouAEIOU";
        for (int i=0;i<x.length();i++)
        {
            if ((x.charAt(i) >= 'a' || x.charAt(i) >= 'A') && (x.charAt(i) <= 'z' || x.charAt(i) <= 'Z'))
            {  String a = ""+x.charAt(i);
                if (vowels.contains(a))
                {
                        ++v_count;
                }
                else{
                    ++c_count;
                }
            } 
        }
        System.out.println("Vowels Count :"+v_count+"const count :"+c_count);
        // String res = "";
        // // ritika - 5-0

        // for (int i=x.length()-1;i>=0;i--)
        // {
        //     res += x.charAt(i);
        // }

        // System.out.println(res);
    }
}