package org.init.com;

public class Init
{

	Init()
	{
		System.out.println("this is init class.");
	}
	{
		a = 1;
	}
	int a = 9;


	public static void main(String[] args)
	{
		System.out.println(new Init().a);	
	}
}
