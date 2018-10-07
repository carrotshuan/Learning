package lee;

public interface InterfaceTest
{

	public static final int MAX_CACHE_LINE = 0;
	
	void output();
	void getData(String msg);

	default void print(String... msgs)
	{
		for (String msg : msgs)
		{
			System.out.println(msg);
		}
	}

	default void test()
	{
		System.out.println("test中的方法。");
	}

	static String staticTest()
	{
		return "接口里的方法";
	}

	private void foo()
	{
		System.out.println("foo私有方法。");
	}

	private static void bar()
	{
		System.out.println("bar私有静态方法。");
	}
}
