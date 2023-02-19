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
import pomPkg.MathsCalculator;
import pomPkg.OnlineCalculator;
import pomPkg.StudyMaterialPage;

public class TestNgOnlineCalculator {

	WebDriver driver;
	/*@BeforeClass
	public void openBrowser()
	{
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_fileFolder\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	*/
	
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
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Before method");
		driver.get("https://byjus.com/calculators/");
		
	}
	
	@Test
	public void checkOnAdditionalCalci()
	{
		System.out.println("Test");
		OnlineCalculator onlineCalculator=new OnlineCalculator(driver);
		onlineCalculator.clickOnOnlineCalci();
		onlineCalculator.clickOnOnlineCalculator();
		String actUrl=driver.getCurrentUrl();
		String actTitle=driver.getTitle();
		System.out.println("Actual url is "+actUrl);
		System.out.println("Actual title is "+actTitle);
		String expUrl="https://byjus.com/maths-calculators/";
		String expTitle="Math Calculators - Free Online Maths Calculator";
		if(actUrl.equals(expUrl) && actTitle.equals(expTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		
		
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

