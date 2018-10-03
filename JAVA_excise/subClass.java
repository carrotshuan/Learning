package subClassTest;


class baseClass{

	public int a = 1;
	public void show(){
		System.out.println("This is base class show.");
	}
}
public class subClass extends baseClass{

	public int a;

	public subClass(){
		this.a = 10;
	}

	public void show(int num){
		System.out.println("This is sub class show,num is"+num);
	}

	public static void main(String[] args){
		baseClass b = new subClass();
		b.show();
	}



}
