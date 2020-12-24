import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList<Integer> x=new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        System.out.println(x);
        // x.remove(4);
        x.add(0,100);
        x.set(1,10000);
        System.out.println(x);
        int a = x.get(0);
        System.out.println(a);
    }
}
