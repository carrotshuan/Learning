

public class LocalInnerClass
{
	public void info()
	{
		class inner
		{
			int a = 10;
		}
		
		inner ic = new inner();
		
		System.out.println("inner class info, ic.a = "+ic.a);
	}

	public static void main(String[] args)
	{
		LocalInnerClass lic = new LocalInnerClass();
		lic.info();
	}
}
