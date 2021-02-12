abstract class Insurance{
	int x;
	int y;
	Insurance(){
		x=100;
		y=200;
	}
	
	void withDraw() {
		System.out.println(" X is "+x+"and"+"y is"+y);
	}
	abstract void pay();
}


class LifeInsurance extends Insurance{

	@Override
	void pay() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractClassDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeInsurance obj = new LifeInsurance();
		obj.withDraw();
		

	}

}
