public class subTest{
	private int age;
	public subTest(int a){
		this.age = a;
	}
	public void show(){
		System.out.println(this.age);
	}
}

public class testGouzao{

	public static void main(String[] args){
		subTest s = new subTest(10);
		s.show();
	}

}
