package org.learntestngframework;

import org.testng.annotations.Test;

public class GroupExampleOne {
	@Test(groups = "Apple")
	public static void appleOne() {
		System.out.println("Apple1");
	}
	
	@Test(groups = "Apple")
	public static void appleTwo() {
		System.out.println("Apple2");
	}
	@Test(groups = "Orange")
	public static void OrangeOne() {
		System.out.println("Orange1");
	}
	@Test(groups = "Orange")
	public static void OrangeTwo() {
		System.out.println("Orange2");
	}
}
