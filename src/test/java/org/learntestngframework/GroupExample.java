package org.learntestngframework;

import org.testng.annotations.Test;

public class GroupExample {
	@Test(groups = "A")

	public void Ind()
	{
		System.out.println("India");
	}
	
	@Test(groups = "A")
public void Pak()

	{
		System.out.println("Pakistan");
	}

	@Test(groups = "B")
	public void Aus()
	{
		System.out.println("Australia");
	}
	@Test(groups = "B")
	public void SL()
	{
		System.out.println("Srilanka");
	}
}
