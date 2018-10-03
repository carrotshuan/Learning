class recusive{

	public static int fn(int a){
		if (a == 0){
			return 1;
		}
		else{
			return a+fn(a-1);
		}
	}

	public static void main(String[] args){
		System.out.println( fn(10) );
	}
}
