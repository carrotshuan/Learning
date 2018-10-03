package org.tmp.com;

class Tmp{

	private int count;

	Tmp(){
		this.count = 10;
	}

	public void show(){
		System.out.println(this.count);
	}
}

class NewTmp extends Tmp{

	public String name;
	NewTmp(){
		this.name = "my name is:";
	}

	public void show(){
		System.out.println(this.name);
	}

	public static void main(String[] args){
		Tmp t = new Tmp();
		t.show();
	}
	
}
