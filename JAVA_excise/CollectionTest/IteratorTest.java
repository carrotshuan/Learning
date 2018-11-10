import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest
{
	public static void main(String[] args)
	{
		Collection c = new HashSet();
		c.add(1);
		c.add(2);
		c.add(3);

		System.out.println("Elements:"+c.size());

		Iterator it = c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
