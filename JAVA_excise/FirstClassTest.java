public class FirstClassTest{
	int num = 0;

	void show(){
		System.out.println(this.num);
	}

	public static void main(String[] args){
		FirstClassTest f = new FirstClassTest();
		f.num = 100;
		f.show();
	}
}