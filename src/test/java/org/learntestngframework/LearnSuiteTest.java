package org.learntestngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSuiteTest {
	static WebDriver driver;
	
	@Test
	public void openGoogle()
	{
		long startTime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		long endTIme = System.currentTimeMillis();
		long totalTime = endTIme - startTime;
		System.out.println(totalTime);
	}
	@Test
	public void openBing()
	{
		long startTime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endTIme = System.currentTimeMillis();
		long totalTime = endTIme - startTime;
		System.out.println(totalTime);
	}
@Test
public void openYahoo()
{
	long startTime = System.currentTimeMillis();
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.yahoo.com/");
	driver.quit();
	long endTIme = System.currentTimeMillis();
	long totalTime = endTIme - startTime;
	System.out.println(totalTime);
}
}
//package com.test;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//public class UsingTestnginSelenium {
//	static WebDriver driver;
//	long startTime;
//	
//	@BeforeSuite
//	public void launchBrowser()
//	{
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Subathra\\eclipse-workspace1\\Test\\ChromeDriver\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 startTime = System.currentTimeMillis();
//		
//}
//	@Test
//	public void openGoogle()
//	{
//		driver.get("https://www.google.com/");
//		
//	}
//	@Test
//	public void openBing()
//	{
//		driver.get("https://www.bing.com/");
//		
//	}
//	@Test
//	public void openYahoo()
//	{
//		driver.get("https://www.yahoo.com/");
//		
//	}
//	@AfterSuite
//	public void closeBrowser()
//	{
//		driver.quit();
//		long endTime = System.currentTimeMillis();
//		long totalTime=	endTime-startTime;
//		System.out.println(totalTime);
//	}
//	
//}
//
//}
