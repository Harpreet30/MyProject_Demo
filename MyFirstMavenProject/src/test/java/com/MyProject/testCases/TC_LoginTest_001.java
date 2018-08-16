package com.MyProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyProject.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		logger.info("Url has been started");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username has been provided");
		lp.setPassword(password);
		logger.info("Password has been provided");
		lp.clickSubmit();
		logger.info("Submitted button has been clicked");
		
		logger.info("Validation has been started");
		Thread.sleep(2000);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Test case passed successfully");
		}
		else
		{
			captureScreen(driver,"LoginTest");
			logger.info("Test case failed");
			Assert.assertTrue(false);
		}
	}
	

}
