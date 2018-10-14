import org.arr.operate.ArrOperate;

class ArrPrint implements ArrOperate
{
	public void processArr(int[] arr)
	{
		for(int a : arr)
		{
			System.out.println(a);
		}
	}
}
class ArrSum implements ArrOperate
{
	public void processArr(int[] arr)
	{
		long sum = 0;
		for (int a : arr)
		{
			sum += a;
		}
		System.out.println("Sum of arr is:"+sum);
	}
}

public class ArrOperateInterfaceTest
{
	int[] arr = {1,2,3,4,5};

	public void operateArrWithInterface(ArrOperate a)
	{
		a.processArr(arr);
	}

	public static void main(String[] args)
	{
		ArrOperateInterfaceTest a = new ArrOperateInterfaceTest();
		a.operateArrWithInterface(new ArrPrint());
		a.operateArrWithInterface(new ArrSum());

	}
}
