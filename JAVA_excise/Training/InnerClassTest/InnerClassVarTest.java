public class InnerClassVarTest
{
	private String prop = "var in outter class.";

	private class InnerClass
	{
		private String prop = "var in inner class.";

		public void info()
		{
			String prop = "local var.";

			System.out.println(InnerClassVarTest.this.prop);
			System.out.println(this.prop);
			System.out.println(prop);
		}
	}

	public void test()
	{
		InnerClass ic = new InnerClass();
		ic.info();
	}

	public static void main(String[] args)
	{
		InnerClassVarTest icv = new InnerClassVarTest();
		icv.test();
	}
}
