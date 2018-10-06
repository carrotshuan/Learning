class Person
{
	int age;
	int number;
}

public class FinalRefTest
{
	public static void main(String[] args)
	{
		final Person p = new Person();
		p.age = 100;
		p.number = 10;

		String a = "ls";
		final String b = "l";
		final String c = "s";
		String d = b + c;
		System.out.println(a == d);
	}
}
