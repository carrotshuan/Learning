public class manyVars{

	public static void test(int a, int... args){
		for(int arg:args){
			System.out.println("arg:"+arg);
		}
	}

	public static void main(String[] args){
		test(1,2,3);
	}
}
