class stringDemo{
    public static void main(String [] args)
    {
        String name1 = "Ritika";
        String name2 = "Ritika";
        String name3 = new String("Ritika");
        
        System.out.println(name1==name2);
        // System.out.println(name1==name3);
        System.out.println(name1.equals(name3));


    }
}