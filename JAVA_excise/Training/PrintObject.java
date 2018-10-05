class Person
{
	private String name;

	public Person(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return "this is a description.";
	}
}

public class PrintObject
{
	public static void main(String[] args)
	{
		Person p = new Person("lilei");
		Person q = new Person("lilei");
		String s = new String("lilei");
		//System.out.println(p.toString());

		System.out.println(1.0 == 1);
		System.out.println( 'a' == 97);
		System.out.println( p == q );
		//System.out.println( s == q ); syntex error

	}
}
