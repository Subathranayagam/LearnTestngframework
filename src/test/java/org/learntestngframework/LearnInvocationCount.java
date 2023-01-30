package org.learntestngframework;

import org.testng.annotations.Test;

public class LearnInvocationCount {
	@Test(invocationCount = 10, threadPoolSize = 2 )
	public void method() throws InterruptedException
	{
		System.out.println("Method");
		Thread.sleep(1000);
	}

}
