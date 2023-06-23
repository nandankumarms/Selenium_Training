package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("executing Before test");
	}
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("executing beforesuit");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("executing before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("executing before method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Executing after method");
	}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("executing aftersuit");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("Executing aftertest");
	}
	
	@Test
	public void demoTest() {
		System.out.println("Executing test");
	}
	
	@Test
	public void demotest2() {
		System.out.println();
	}

}
