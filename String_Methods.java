
public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "";
		String y = "JAVA";
		String vowels = "aeiou";
//		System.out.println(x.charAt(1));
//		System.out.println(x.length());
		System.out.println(x+y);//concatenation
		System.out.println(x.concat(y));//concatenation
		System.out.println(x.replace('l', 'L'));
		System.out.println(x.replaceFirst("l", "L"));
		System.out.println(x.startsWith("H"));
		System.out.println(x.endsWith("o"));
		System.out.println(y.indexOf("a"));
		System.out.println(x.lastIndexOf("l"));
		System.out.println(x.compareTo(y));
		System.out.println(x.toLowerCase());
		System.out.println(x.toUpperCase());
		System.out.println(vowels.contains("a"));
		System.out.println(x.compareToIgnoreCase(y));
		System.out.println(x.isEmpty());
		String z = "Java is a programming language";
		String arr[] = z.split(" ");
		
		for (String p:arr) {
			System.out.println(p);
		}
		String l = "                            hey                      ";
		System.out.println(l.trim());
	}

}
