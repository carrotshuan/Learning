class Singleton
{
	private static Singleton s;
	private Singleton(){}
	
	public static Singleton getSingleton()
	{
		if (s == null)
		{
			s = new Singleton();
		}
		return s;
	}

}
public class SingletonTest
{
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();

		System.out.println(s1 == s2);
	
	}
}
