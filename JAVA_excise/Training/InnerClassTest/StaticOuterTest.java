class Base
{
	public static class Inner
	{
		public static void info()
		{
			System.out.println("info in inner.");
		}
	}

	public void info()
	{
		System.out.println("info in outter.");
		Inner.info();
	}
}

public class StaticOuterTest
{
	public static void main(String[] args)
	{
		Base b = new Base();
		b.info();		
	}
}
