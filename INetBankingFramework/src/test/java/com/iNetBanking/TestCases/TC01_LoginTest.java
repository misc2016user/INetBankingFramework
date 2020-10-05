package com.iNetBanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.LoginPage;

public class TC01_LoginTest extends BaseClass {
	
	@Test
	public void loginPageTest() {
		System.out.println("Entered loginPageTest method");
		
		driver.get(baseURL);
		System.out.println("Base URL given");
		//NOW PASSING SAME DRIVER INSTANCE TO THE LOGIN PAGE CLASS SO THAT IT CAN FIND ELEMENTS ON THE SAME
		
		LoginPage loginpage=new LoginPage(driver);
			
		loginpage.setUserName(userName);
		logger.info("Username is enetered");
		loginpage.setPassword(password);
		logger.info("Password is enetered");
		loginpage.clickLoginButton();
		logger.info("Login button is clicked");
		
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
	}
	

}
