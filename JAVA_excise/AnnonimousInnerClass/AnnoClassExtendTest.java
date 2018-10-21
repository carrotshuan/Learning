class Father
{
	public void show()
	{
		System.out.println("info in father.");
	}
}

public class AnnoClassExtendTest
{

	public static void main(String[] args)
	{
		Father f = new Father()
		{
			public void show()
			{
				System.out.println("info in instance.");
			}
		};
		f.show();

	}
}
