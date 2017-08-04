package samplePkg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedtestcaseintestNG implements IRetryAnalyzer 
{

	@Override
	public boolean retry(ITestResult result) {
		 
		
		return false;
	}

}
