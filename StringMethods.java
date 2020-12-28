public class StringMethods {
    public static void main(String[] args) {
        String x = "Eello";
        String y = "Hveryone";
        // System.out.println(x.charAt(3));
        // System.out.println(x+y);
        
        // System.out.println(x.concat(y));
        // System.out.println(x.compareTo(y));
        // System.out.println(x.replace('l','x'));
        // System.out.println(x.replaceFirst("l","x"));
        // System.out.println(x.startsWith("E"));
        // System.out.println(x.endsWith("E"));
        // System.out.println(x.indexOf('E'));
        // System.out.println(x.indexOf("ell"));

        // char z[] = x.toCharArray();
        // for (char i: z)
        // {
        //     System.out.println(i);
        // }

        String ab="Hello everyone how r u ?";
        String [] arr=ab.split(" ");
        for (String i:arr)
        {
            System.out.println(i);
        }






    }
}
