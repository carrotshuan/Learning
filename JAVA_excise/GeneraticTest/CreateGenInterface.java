class Animal<T>
{
	private T name;

	public Animal(T name)
	{
		this.name = name;
		System.out.println("This is animal with "+name);
	}
}

public class CreateGenInterface
{
	public static void main(String[] args)
	{
		Animal<String> a = new Animal<>("people");
		
	}
}
