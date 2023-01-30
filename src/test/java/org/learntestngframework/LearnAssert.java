package org.learntestngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnAssert extends VerifyTitle{
	
	
	@Test

	public void test()
	{
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle ="Google";
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Test case passed");
	}

	

}
