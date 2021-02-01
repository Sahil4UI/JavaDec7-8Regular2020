//What to do
interface Player{
	int MAX_HEALTH=100;
	int MIN_HEALTH=10;
	void fire();
	void defense();
	void punch();

}

class Ritika implements Player{

	@Override

	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("Fire");
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("Defense");
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		System.out.println("Punch");
	}
	
}


class Interface_Demo{

		public static void main(String[] args) {
			Ritika obj = new Ritika();
			obj.fire();
			obj.defense();
			obj.punch();
		}
}