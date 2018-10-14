class Outer
{
	public static class Inner
	{
		public static void info()
		{
			System.out.println("inner function.");
		}
	}
}

public class UseInnerStaticClass
{
	public static void main(String[] args)
	{
		Outer.Inner oi = new Outer.Inner();
		oi.info();
	}
}
