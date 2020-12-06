package Exam;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day4 {

	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginHomeLoan(String username, String key)
	{
		//selenium
		System.out.println("WebLoginHome");
		System.out.println(username);
		System.out.println(key);
	}
	
	@Test
	public void mobileLoginHomeLoan()
	{
		//Appium
		System.out.println();
		System.out.println("mobileLogHomeLoan");
	}
	@AfterTest
	public void postRequist()
	{
		System.out.println("After test execute at last of the test"); 
	}
	
	@Test
	public void loginApiHomeLoan()
	{
		//Rest API
		System.out.println("ApiLoginHomeLoan");
	}

}
