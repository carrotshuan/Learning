class Person
{
	public Person()
	{
		System.out.println("Constructor in Person");
	}
}

public class ExtendsTest extends Person
{

	public ExtendsTest()
	{
		super();
		System.out.println("Constructor in ExtendsTest");
	}

	public static void main(String[] args)
	{
		ExtendsTest et = new ExtendsTest();
	}
}
