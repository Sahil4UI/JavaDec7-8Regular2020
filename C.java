class B{
	//instance
	String x;
	B(){
		System.out.println("Default Cons : class B");
	}
	
//	local 
	B(String x){
		this.x=x;
		System.out.println("Parameterized Constructor : class B , x="+x);
	}
}


class C extends B {
	String x;
	C(){
		
		System.out.println("Default Cons : class C");
	}
	
//	local 
	C(String x){
		super();
		this.x=x;
		System.out.println("Parameterized Constructor : class C, x="+x);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			C obj=new C("Hello");
	}

}
