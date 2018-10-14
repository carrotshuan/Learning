public class InnerClassTest
{
	public class InnerClass
	{
		public void info()
		{
			System.out.println("Inner class test, outter private num is:"+num);
		}
	}

	private int num = 10;

	public InnerClass ic = new InnerClass();

	public static void main(String[] args)
	{
		InnerClassTest i = new InnerClassTest();
		i.ic.info();
	}
}
