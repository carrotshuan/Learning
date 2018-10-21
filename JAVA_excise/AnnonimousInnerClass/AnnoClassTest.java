interface Law
{
	public void showLaw();
}
public class AnnoClassTest
{

	public static void main(String[] args)
	{
		Law l = new Law()
		{
			public void showLaw()
			{
				System.out.println("Information in show law.");
			}
		};
		l.showLaw();
	}
}
