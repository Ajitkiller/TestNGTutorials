package Exam;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListeners is interface which implements Testng listeners
public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test is start "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is success "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is fail "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is skipped "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test is Failed But Within Success Percentage "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//System.out.println("Test is start "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	//	System.out.println("Test is finish "+context.getName());
	}

}
