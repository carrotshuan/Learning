import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class forEachRemainingTest
{
	public static void main(String[] args)
	{
		Collection books = new HashSet();
		books.add("sassibia");
		books.add("kali");

		// use iterator.
		Iterator it = books.iterator();
		it.forEachRemaining(obj-> System.out.println(obj));

		// use for.
		for(Object o : books)
		{
			System.out.println(o);
		}
	}
}
