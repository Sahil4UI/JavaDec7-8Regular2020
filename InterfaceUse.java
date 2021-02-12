interface Calculate{
	int compute(int x , int y);
}

class A1 {
	
	void show()
	{
		System.out.println("A show");
	}
	void print() {
		System.out.println("A Print");
	}
}


class MyCalc implements Calculate{

	@Override
	public int compute(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
}


public class InterfaceUse{
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.show();
		a1.print();
		
	}
}