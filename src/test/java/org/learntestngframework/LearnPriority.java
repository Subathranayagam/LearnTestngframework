package org.learntestngframework;

import org.testng.annotations.Test;

public class LearnPriority {
	
	@Test
	public void method()
	{
		System.out.println("Method");
	}
	@Test
	public void methodS()
	{
		System.out.println("MethodS");
	}                                               //doubt
	@Test(priority = -1)
	public void methodA()
	{
		System.out.println("MethodA");
	}
	@Test(priority = 0)
	public void method1()
	{
		System.out.println("Method1");
	}
}
