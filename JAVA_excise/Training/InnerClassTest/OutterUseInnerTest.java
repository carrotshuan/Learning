class Outter
{
	class Inner
	{
		public Inner()
		{
			System.out.println("constructor in Inner.");
		}
	}

}

public class OutterUseInnerTest
{
	public static void main(String[] args)
	{
		Outter.Inner in = new Outter().new Inner();
	}
}
