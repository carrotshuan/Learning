package Ext;

class Person{

	public int age;
	public String name;

	public void show(){
		System.out.println(age);
	}
}

public class extTest extends Person{

	public void showPerson(){
		this.show();
	}

	public static void main(String[] args){
		extTest t = new extTest();
		t.showPerson();
		System.out.println("HELLO");
	}

}
