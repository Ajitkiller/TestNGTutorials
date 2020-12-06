package Exam;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	
	@Test
	public void pLoan()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("i will execute before test");
	}
	@BeforeMethod
	public void preMethods()
	{
		System.out.println("i will execute before method");
	}
	@AfterSuite
	public void postSuiteRequist()
	{
		System.out.println("this is After suite place");
	}
	@Test(groups={"Smoke"})
	public void hLoan()
	{
		System.out.println("Home + smoke test added");
	}
}
