package extClass;

class Dog{
	int legs;

	Dog(){
		legs = 4;
	}
}
class Person{

	int age;
	String name;

	Person(){
		age = 10;
		name = "lilei";
	}

	public void showName(){
		System.out.println("name is:"+this.name);
	}

	public void showDogLegs(){
		Dog d = new Dog();
		System.out.println("Dog has "+d.legs+" legs.");

	}
}


public class exTest extends Person{

	int number;

	public static void main(String[] args){
		exTest e = new exTest();
		e.showDogLegs();	
	}
}


