class Person{
	public int age = 0;
	void speek(){
		System.out.println("Hello.");
	}
}

public class Override extends Person{
	public int age = 10;
	void speek(){
		System.out.println("Hello, world.");
	}

	public static void main(String[] args){
		Person o = new Override();
		o.speek();
		((Person)o).speek();

		Override oo = new Override();
		oo.speek();
		((Person)oo).speek();

		System.out.println(o.age);
		System.out.println(((Person)o).age);
		System.out.println(oo.age);
		System.out.println(((Person)oo).age);
	}
}
