import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class GeneList
{
	public static void main(String[] args)
	{
		List<String> al = new ArrayList<String>();
		al.add("nihao");
		al.add("shijie");
		//al.add(5);

		System.out.println(al);

		List<String> ls = new ArrayList<>();
		ls.add("<> array.");
		System.out.println(ls);
	}
}
