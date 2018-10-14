interface Product
{
	public double getPrice();
	public String getName();
}
public class AnnonimousClass
{
	public void test(Product p)
	{
		System.out.println(p.getPrice());
		System.out.println(p.getName());
	}

	public static void main(String[] args)
	{
		AnnonimousClass asc = new AnnonimousClass();
		asc.test(new Product()
		{
			public double getPrice()
			{
				return 12.34;
			}

			public String getName()
			{
				return "lilei";
			}
		});
	}
}
