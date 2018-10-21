public class EnumClassTest
{
	public void judge(SeasonEnum se)
	{
		if (se == SeasonEnum.SPRING)
			System.out.println("Now is spring.");
		else
			System.out.println("It's not spring now.");
	}
	public static void main(String[] args)
	{
		EnumClassTest ect = new EnumClassTest();
		SeasonEnum se = SeasonEnum.SPRING;
		ect.judge(se);
		ect.judge(SeasonEnum.SUMMER);

		System.out.println(SeasonEnum.SPRING);
	}
}
