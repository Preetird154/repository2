package example;

class abc{
	
	public void div()
	{
		int a=10;
		int b=2;
		int res=a/b;
		System.out.println("Division: "+res);
	}
	
	public void mul()
	{
		int a=10;
		int b=2;
		int res=a*b;
		System.out.println("Multiplication: "+res);
	}
}


public class Division {
	public static void main(String[] args) {
		abc a=new abc();
		a.div();
		a.mul();
	}

}
