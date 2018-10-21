interface show
{
	public void info();
}

public enum NumInterface implements show
{
	ONE
	{
		public void info()
		{
			System.out.println("This is one");
		}
	},
	TWO
	{
		public void info()
		{
			System.out.println("This is two");
		}
	
	},
	THREE
	{
		public void info()
		{
			System.out.println("This is three");
		}
	
	};

}
