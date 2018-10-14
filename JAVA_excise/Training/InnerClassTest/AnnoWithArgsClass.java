abstract class People
{
	public abstract void mind();
	public People(){}
	public People(String thing)
	{
		System.out.println("people is "+thing);
	}
}	

public class AnnoWithArgsClass
{
	public void test(People p)
	{
		
	}

	public static void main(String[] args)
	{
		AnnoWithArgsClass awac = new AnnoWithArgsClass();

		awac.test(new People("people...")
		{
			public void mind()
			{
				System.out.println("mind with args");
			}
		}
		);

		People p = new People()
		{
			public void mind()
			{
				System.out.println("mind without args");
			}
		};
	}
}
