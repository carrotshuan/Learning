public class StaticVarTest
{
	public static int number = 0;
	int age = 0;
	
	public static void show()
	{
		System.out.println("static function.");
	}
	public static void main(String[] args)
	{
		StaticVarTest.number = 100;
		StaticVarTest t = null;

		System.out.println(t.number);

		t.show();
	}
}
