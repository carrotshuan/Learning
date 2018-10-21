@FunctionalInterface
interface Law
{
	public void showLaw();
	
	default void anotherShow(String mes)
	{
		System.out.println("another message in show:"+mes);
	}
}
public class LambdaFuncTest
{
	public static int age = 10;

	public void showAge()
	{
		System.out.println(LambdaFuncTest.age);
	}
	public static void main(String[] args)
	{
		Law lw = ()->{
			System.out.println("This is a test in law.");
		};
		lw.anotherShow("hello");

		LambdaFuncTest lft = new LambdaFuncTest();
		lft.showAge();
	}
}
