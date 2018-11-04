class Base
{
	static 
	{
		System.out.println("initialization in static chuck.");
	}
	static final String compile = "Craze java.";
}

public class InitialClassTest
{
	public static void main(String[] args)
	{
		System.out.println(Base.compile);
	}
}
