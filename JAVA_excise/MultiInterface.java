interface InterfaceA
{
	int PROP_A = 5;
	void testA();
}

interface InterfaceB
{
	int PROP_B = 6;
	void testB();
}

interface InterfaceC extends InterfaceA,InterfaceB
{
	int PROP_C = 7;
	void testC();
}
public class MultiInterface
{
	public static void main(String[] args)
	{
		System.out.println(InterfaceC.PROP_A+InterfaceC.PROP_B+InterfaceC.PROP_C);
	}
}
