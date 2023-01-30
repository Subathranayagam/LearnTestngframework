package org.learntestngframework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization {
	@Test
	@Parameters("Name")
	public void test2(String name)
	{
		System.out.println("Name is" +name);
	}
}

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Test">
//  <test thread-count="5" name="Test">
//  <parameter name="Name" value="Duck"></parameter>
//  
//<classes>
//      <class name="org.learntestngframework.DependsOnMethod">
//      
//      </class>
//   
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->


