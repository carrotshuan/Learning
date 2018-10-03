class Base
{
	Base()
	{
		show();
	}
	public void show()
	{
		System.out.println("Hello base.");
	}
}

public class nullTest extends Base
{
	public void show()
	{
		System.out.println("Hello sub.");
	}


	public static void main(String[] args)
	{
		nullTest n = new nullTest();
		
	}
}
