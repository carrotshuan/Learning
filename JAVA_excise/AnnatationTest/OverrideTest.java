class Base
{
	void show()
	{
	}
}
public class OverrideTest extends Base
{
	@Override
	void show()
	{
		System.out.println("this is message from override.");
	}
	public static void main(String[] args)
	{
		OverrideTest ot = new OverrideTest();
		ot.show();
	}
}
