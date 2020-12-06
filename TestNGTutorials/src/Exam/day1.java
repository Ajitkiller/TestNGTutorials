package Exam;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void demo()
	{
		System.out.println("class-1 1st test");
	}
	
	@Test(groups={"Smoke"})
	public void secondTest()
	{
		System.out.println("class-1 2nd test");
	}
	
	@Test(enabled=true)
	public void arik()
	{
		System.out.println("class-1 4th test");
	}
	
	@BeforeSuite
	public void preSuiteRequist()
	{
		System.out.println("this is Before suite place");
	}
	@Test(dependsOnMethods={"demo"})
	public void accountDemands()
	{
		System.out.println("class-1 5th test");
		
	}
	@Test(timeOut=4000)
	public void zooemo()
	{
		System.out.println("class-1 3rd test");
	}
	@Test
	public void beta()
	{
		System.out.println("class-1 6th test");
	}
}
