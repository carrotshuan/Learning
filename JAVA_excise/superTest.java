class Person{

	int age;

	Person(){
		age = 0;
	}

	Person(int age){
		this.age = age;
	}
}

public class superTest extends Person{
	String name;

	superTest(){
		//super(10);
		super();
		name = "lilei";
	}

	public void show(){
		System.out.println("age is " + age);
		System.out.println("name is " + name);
	}

	public static void main(String[] args){
		superTest s = new superTest();
		s.show();
	}

}
