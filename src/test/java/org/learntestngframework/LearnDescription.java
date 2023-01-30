package org.learntestngframework;

import org.testng.annotations.Test;

public class LearnDescription {
	@Test(description = "Check whether submit button is working")
	public void test()
	{
		System.out.println("Test");
	}

}
