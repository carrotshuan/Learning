import java.io.FileOutputStream;
import java.util.Properties;

public class SystemClassTest
{
	public static void main(String[] args)
		throws Exception
	{
		System.out.println(System.getenv("JAVA_HOME"));

		Properties props = System.getProperties();
		props.store(new FileOutputStream("props.txt"),"System Properties");
		System.out.println(System.getProperty("os.name"));

	}
}
