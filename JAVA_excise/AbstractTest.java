class Ext extends AbstractTest
{
	public void test()
	{
		System.out.println("test.");
	}
}
public abstract class AbstractTest
{
	private int a;

	public void setA(int a)
	{
		this.a = a;
	}
	public int getA()
	{
		return a;
	}

	public abstract void test();

	public static void main(String[] args)
	{
		Ext e = new Ext();
		e.test();
		e.setA(10);
		System.out.println(e.getA());
	}
}
