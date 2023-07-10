package example;

class abc{
	
	int a=10;
	int b=2;
	
	public void div()
	{
		int res=a/b;
		System.out.println("Division: "+res);
	}
	
	public void mul()
	{
		int res=a*b;
		System.out.println("Multiplication: "+res);
	}
	
	public void add()
	{
		int res=a+b;
		System.out.println("Addition: "+res);
	}
}

public class Division {
	public static void main(String[] args) {
		abc a=new abc();
		a.div();
		a.mul();
		a.add();
	}
}
