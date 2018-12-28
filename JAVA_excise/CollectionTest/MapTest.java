import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class MapTest
{
	public static void main(String[] args)
	{
		Map m = new HashMap();
		m.put("name","Lilei");
		m.put("age","16");
		m.put("id","student");

		System.out.println(m);
	}
}
