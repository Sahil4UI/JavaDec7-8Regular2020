
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student(101,"SAHIL","b.tECH",90);
		
		obj.print();
		
		obj.setCourseName("BCA");
		
		System.out.println("*****************************");
		obj.print();
		
		String name = obj.getName();
		System.out.println(name);

	
	}

}
