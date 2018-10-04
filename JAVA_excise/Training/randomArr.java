public class randomArr
{
	public static void main(String[] args)
	{
	
		int[] arr = new int[5];

		for (int i = 0; i< 5; i++)
			arr[i] = (int)(Math.random() * 10);
		int min = arr[0];

		for (int i: arr)
		{
			if (i < min)
			{
				min = i;
			}
		}
		System.out.println("Min value is:" + min);
	}
}
