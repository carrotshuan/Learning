@FunctionalInterface
interface Law
{
	public void showLaw();
}

interface LawArgs
{
	public int showLaw(String arg);
}
public class LambdaTest
{
	public static void main(String[] args)
	{
		//Law lw = ()-> System.out.println("info in law.");
		Law lw = ()-> 
		{
			System.out.println("info in law.");
			System.out.println("Another info in law.");
		};
		lw.showLaw();
		
		//String mes = "message.";
		LawArgs la = Integer::valueOf;
		System.out.println(la.showLaw("15")+10);
	}
}
