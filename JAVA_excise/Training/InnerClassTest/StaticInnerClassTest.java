public class StaticInnerClassTest
{
	private static class InnerClass
	{
		//static 
		{
			System.out.println("Error test.");
		}
		private static int prop1 = 5;
		private int prop2 = 9;

	}

	public void accessInnerProp()
	{
		System.out.println(InnerClass.prop1);
		System.out.println(new InnerClass().prop2);
	}
	public static void main(String[] args)
	{
		StaticInnerClassTest sict = new StaticInnerClassTest();
		sict.accessInnerProp();
	}
}
