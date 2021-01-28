


class A{
	void show() {
		System.out.println("I am a Show function");
	}
	A(){
		System.out.println("class A cons call");
	}
	A(int x){
		System.out.println("A parameterized cons called");
	}
}





class ConsCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();

	}

}
