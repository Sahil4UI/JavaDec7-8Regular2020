import java.util.ArrayList;

public class AnonymousFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			lambda function
		
		ArrayList<Integer> x = new ArrayList<Integer>(); 
		x.add(5);
		x.add(6);
		x.add(7);
		x.add(8);
		
		x.forEach( (n) -> {System.out.println(n);});
	}

}
