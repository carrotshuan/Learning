import java.util.ArrayList;
import java.util.List;

public class MatchGenTest
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<>();
		l.add("name");
		l.add("age");

		MatchGenTest mgt = new MatchGenTest();
		mgt.test(l);
	}

	public void test(List<? extends String> c)
	{
		for (int i = 0; i< c.size(); i++)
		{
			System.out.println(c.get(i));
		}

		c.add("Hello");
	}

