public class reverseArr
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		int[] revArr = new int[5];
		for(int i = 0; i<5; i++)
		{
			arr[i] = (int)(Math.random() * 100);
			System.out.println(arr[i]);
		}

		int j = 0;

		for(int i : arr)
		{
			revArr[5-1-j] = i;
			j++;
		}
		for(int i:revArr)
		{
			System.out.println(i);
		}
	}
}
