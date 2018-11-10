import java.util.Collection;
import java.util.ArrayList;

public class CollectionTest
{
	public static void main(String[] args)
	{
		Collection c = new ArrayList();
		c.add("abc");
		c.add(6);
		System.out.println(c.size());

		c.remove("abc");
		System.out.println(c.size());


		boolean containFlag = c.contains(6);
		System.out.println(containFlag);

	}
}
