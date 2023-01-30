package org.learntestngframework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LearnListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test is going to start");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skpped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Before everything");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("After everything");
		
	}
	
//	<?xml version="1.0" encoding="UTF-8"?>
//	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//	<suite name="Suite">
//	<listeners>
//	<listener class-name="org.learntestngframework.LearnListeners"></listener>
//	</listeners>
//	  <test thread-count="5" name="TestOne">
//	    <classes>
//	      
//	      <class name="org.learntestngframework.LearnDescription"/>
//	      
//	    </classes>
//	  </test> <!-- TestOne -->
//	</suite> <!-- Suite -->


}
