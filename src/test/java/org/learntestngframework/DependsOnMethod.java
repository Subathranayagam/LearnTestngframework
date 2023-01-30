package org.learntestngframework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DependsOnMethod {
	@Test(dependsOnMethods =
		{"test1","testA"})
	public void test()
	{
		System.out.println("Test");
	}
	
	@Test
	public void testA()
	{
		System.out.println("TestA");
	}
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
}
