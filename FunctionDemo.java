class Practice
{
//	default function
	public void MyFunction(){
		
		System.out.println("Hello");
	}
	
//	parameterized function
//	public void Add(int x, int y)
//	{
//		System.out.println(x+y);
//	}
//	function definition
	public int Add(int x, int y)
	{
		return x+y;
	}
}


class FunctionDemo {
		public static void main(String[] args) {
			Practice obj = new Practice();
//			funmction calling
			int res= obj.Add(10,20);
			System.out.println(res);
		}
}
