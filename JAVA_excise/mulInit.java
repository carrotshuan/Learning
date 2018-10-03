class A
{
	static{
		System.out.println("A static init.");
	}

	{
		System.out.println("A init.");
	}
	public A()
	{
		System.out.println("A gouzao.");
	}
}

class B extends A
{
	
	static{
		System.out.println("B static init.");
	}

	{
		System.out.println("B init.");
	}

	public B()
	{
		super();
		System.out.println("B gouzao");
	}

	public B(String s)
	{
		this();
		System.out.println("B with arg:" + s);
	}
}

public class mulInit
{

	public static void main(String[] args){
		B b = new B();
		B c = new B();
	}


}
