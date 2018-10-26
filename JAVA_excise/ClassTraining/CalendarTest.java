import java.util.Calendar;

public class CalendarTest
{
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		c.set(2019,10,26,0,0,0);
		c.add(Calendar.YEAR,1);
		System.out.println(c.getTime());
	}
}
