package testPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomPkg.AdditionCalculator;

public class TestNgAdditionalCalculator {

	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void OpenBrowser(String browserName)
	{
		System.out.println("Open Browser before excute the test method..");
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation_fileFolder\\chromedriver.exe");
			driver= new ChromeDriver();	
		}
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Automation_fileFolder\\geckodriver-v0.32.0-win64\\geckodriver.exe" );
			driver= new FirefoxDriver();	
		}
		if(browserName.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver","D:\\Automation_fileFolder\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver= new OperaDriver();
		}
	}
	/*@BeforeClass
	public void openBrowser()
	{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_fileFolder\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}*/
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Before method");
		driver.get("https://byjus.com/2-digit-number-addition-calculator/");
		
	}
	
	@Test
	public void checkOnAdditionalCalci()
	{
		System.out.println("Test");
		AdditionCalculator additionCalculator=new AdditionCalculator(driver);
		additionCalculator.sendFirstInput("3");
		additionCalculator.sendSecondInput("5");
		additionCalculator.sendThirdInput("6");
		additionCalculator.sendFourthInput("2");
		additionCalculator.clickOnSolveButton();
		
		String actUrl=driver.getCurrentUrl();
		String actTitle=driver.getTitle();
		System.out.println("Actual url is "+actUrl);
		System.out.println("Actual title is "+actTitle);
		
	}
	
	
	
	@AfterMethod
	public void closeCalci()
	{
		System.out.println("After Method");
		driver.close();
	}
	
	/*@AfterClass
	public void closeBrowser()
	{
		System.out.println("After Class");
		//driver.quit();
	}*/
	@AfterTest
	public void closetest()
	{
		System.out.println("close test");
		
	}
}
