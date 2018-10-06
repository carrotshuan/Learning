class Person
{
	private int age;

	private final void show()
	{
		System.out.println(age);
	}

	public final void show(int age)
	{
		System.out.println("show in person.");
	}
}

class Teacher extends Person
{
	public void show()
	{
		System.out.println("show in teacher.");
	}
}
public class FinalFunctionTest
{
	public static void main(String[] args)
	{
		Person p = new Person();
		//p.show();
		p.show(10);

		Teacher t = new Teacher();
		t.show();
	}
}
