package Exam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void webLoginCarLoan()
	{
		//selenium
		System.out.println("WebLoginCarLoan");
	}
	@Test
	public void beforeClass()
	{
		//Appium
		System.out.println("execute Before class");
	}
	@Test
	public void mobileLoginCarLoan()
	{
		//Appium
		System.out.println("Mobile Login Car Loan");
	}
	@AfterMethod
	public void PostMethods()
	{
		System.out.println("i will execute After method");
	}
	@Test(dataProvider="data")
	public void mobileSigninApiCarLoan(String user,String pass)
	{
		//Rest API
		System.out.println("Mobile sign in");
		System.out.println(user);
		System.out.println(pass);
	}
	@Test(dependsOnMethods={"mobileLoginCarLoan","beforeClass"})
	public void mobileAncoutApiCarLoan()
	{
		//Rest API
		System.out.println("Mobile Sign out");
	}
	@AfterClass
	public void afterClass()
	{
		//Appium
		System.out.println("execute After class");
	}
	@DataProvider
	public Object[][] data()
	{
		/*we have 3 row and 2 column which 
		having the separate value of username and password*/
		Object[][] data=new Object[3][2];
		
		//1st set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
		
		
	}
	
}







