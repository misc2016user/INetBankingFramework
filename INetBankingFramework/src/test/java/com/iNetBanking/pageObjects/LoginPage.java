package com.iNetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebDriver driver;

By uid = By.name("uid");
By password=By.name("password");
By loginButton=By.name("btnLogin");

	public LoginPage(WebDriver driver){
		this.driver=driver;
		System.out.println("LoginPage contructor initialized");
	}
	
	public void setUserName(String uname) {
		//WebElement userName=driver.findElement(By.name("uid"));
		//userName.sendKeys(uname);
		driver.findElement(uid).sendKeys(uname);;
		System.out.println("usernemae is entered");
		}

	public void setPassword(String pwd) {
		//userName.sendKeys(pwd);
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		//loginButton.click();
		driver.findElement(loginButton).click();
	}
}
