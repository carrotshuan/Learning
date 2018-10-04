class Student
{
	String name;
	int age;
	String gender;
	int phone;
	String address;
	String email;

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Student()
	{
		System.out.println("Init function.");
	}

	public Student(String name, int age, String gender, int phone, String address, String email)
	{
		
		System.out.println("Another init function.");
	}

	public void sleep()
	{
		System.out.println("student is sleeping...");
	
	}
}


public class characterOne
{
	public static void main(String[] args)
	{
		Student s = new Student();	
		s.setName("lilei");
		System.out.println(s.getName());

		Student[] arrStu = new Student[3];
		arrStu[0] = new Student();
		arrStu[0].sleep();
	}
}
