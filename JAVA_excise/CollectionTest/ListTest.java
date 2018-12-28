import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class ListTest
{
	public static void main(String[] args)
	{
		List books = new ArrayList();
		books.add("A book.");
		books.add("B book.");
		books.add("C book.");
		books.add("D book.");
		books.add(1,"Z book.");
		
		System.out.println(books);

		for(int i = 0; i < books.size(); i++)
		{
			System.out.println(books.get(i));
		}

		books.remove(2);
		System.out.println(books.indexOf(new String("C book.")));

		books.set(0,"replaced book.");
		System.out.println(books);

		System.out.println(books.subList(0,3));


		//sort and replace test
		books.sort((a, b)-> ((String)a).length() - ((String)b).length() );
		System.out.println(books);

		books.replaceAll( ele -> ( (String)ele ).length() );
		System.out.println(books);
	}
}
