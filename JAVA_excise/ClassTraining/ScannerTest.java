import java.util.Scanner;
import java.io.File;

public class ScannerTest
{
	public static void main(String[] args)
		throws Exception
	{
		// Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new File("message.txt"));
		/* sc.useDelimiter("\n");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
		*/
		
		/*
		while(sc.hasNextLong())
		{
			System.out.println(sc.nextLong());
		}
		*/
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}
