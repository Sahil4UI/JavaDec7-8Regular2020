class Animal{
	int legs=2;
	void sleep() {
		System.out.println("Zzzzzzzzzzzzzz");
	}
	
	void legs() {
		System.out.println("Animal has"+ legs+" Legs");
	}
}


class Dog extends Animal{
	int legs=4;
	void Bark()
	{
		System.out.println("Bhow Bhow.....");
		System.out.println(super.legs);
	}
	
	@Override
	void sleep() {
		System.out.println("Dog sleep in night");
//		super.sleep();
	}
	
	public static void main(String[] args) {
		Dog doggie = new Dog();
		doggie.Bark();
//		doggie.legs();
		doggie.sleep();
	}
}
