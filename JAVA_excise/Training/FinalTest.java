public class FinalTest
{
	public final int a;
	public static final int b;

	static 
	{
		b = (int)100.3;
	}

	public FinalTest()
	{
		a = 10;
	}
	public static void main(String[] args)
	{
		FinalTest f = new FinalTest();
		System.out.println(f.b);
	}
}
