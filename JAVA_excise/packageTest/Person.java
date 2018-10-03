package org.person;

import org.dog.Dog;

public class Person{

	public void showDog(){
		Dog d = new Dog();
		System.out.println(d.legs);
	}

	public static void main(String[] args){
		Person p = new Person();
		p.showDog();

	}
}
