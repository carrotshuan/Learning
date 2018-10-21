public class GabbageCollect
{
	public GabbageCollect()
	{
		System.out.println("Initialize gc...");
	}

	public void finalize()
	{
		System.out.println("Gabbage collecting now.");
	}

	public static void main(String[] args)
	{
		for (int i = 0;i < 4;i++)
		{
			new GabbageCollect();
		}

		//System.gc();
		Runtime.getRuntime().gc();
	}
}
