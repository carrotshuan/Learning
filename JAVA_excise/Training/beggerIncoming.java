class Begger
{
	private int age;
	private long incoming;

	public Begger()
	{
		incoming = 0;
		age = 0;
	}

	public void increseIncoming(int days)
	{
		if (days <= 0 || days >= 100 * 365)
			System.out.println("Invalid days.");
		
		for(int i = 1;i <= days; i++)
		{
			// System.out.println("i:"+ i +", incoming:"+incoming);
			incoming += Math.pow(2,i-1);
		}
		return ;
	}

	public void showIncoming()
	{
		System.out.println("Current incoming is:" + Long.toString(incoming));
		return ;
	}

}

public class beggerIncoming
{
	public static void main(String[] args)
	{
		Begger xiaoli = new Begger();
		xiaoli.increseIncoming(10);
		xiaoli.showIncoming();
	}
}
