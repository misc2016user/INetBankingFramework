package com.iNetBanking.TestCases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="http://demo.guru99.com/V4/index.php";
	public String userName="mngr136913";
	public String password="bath1234@";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup(){
	// This is also fine
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\kashi\\eclipse-workspace\\INetBankingFramework\\Drivers\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	
	logger=Logger.getLogger("INetBankingFramework");
	PropertyConfigurator.configure("Log4j.properties");
		
	System.out.println("BaseClass setup completed");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
