import java.util.Collection;
import java.util.HashSet;

public class HashSetTest
{
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add("light java");
		books.add("JAVA EE");
		books.add("Android");

		books.forEach(obj -> System.out.println("forEach: - "+obj));
	}
}
