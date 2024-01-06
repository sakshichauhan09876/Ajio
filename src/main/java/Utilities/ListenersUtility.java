package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersUtility extends BaseClass implements ITestListener{

	
	public void onTestFailure(ITestResult result) {
		 String failedMethod = result.getMethod().getMethodName().toString();
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
			
		 File tempfile= ts.getScreenshotAs(OutputType.FILE);
		
		 String Timestamps= LocalDateTime.now().toString().replace(':', '-');
		
		 File PermFile=new File("./src/test/resources/Scrrenshots/"+Timestamps+failedMethod+".png");
			try {
				FileHandler.copy(tempfile, PermFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		@Override
		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
		}
	
		@Override
		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
		
		}
	
		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void onTestSkipped(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void onTestStart(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void onTestSuccess(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}
	
}