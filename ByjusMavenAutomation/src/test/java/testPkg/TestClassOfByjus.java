package testPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPkg.AdditionCalculator;
import pomPkg.MathsCalculator;
import pomPkg.OnlineCalculator;
import pomPkg.StudyMaterialPage;

public class TestClassOfByjus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_fileFolder\\chromedriver.exe");//key ,path
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://byjus.com/");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		StudyMaterialPage studyMaterialPage=new StudyMaterialPage(driver);
		studyMaterialPage.clickOnStudyMaterial();
		studyMaterialPage.clickOnCalculatorButton();
		
		OnlineCalculator onlineCalculator=new OnlineCalculator(driver);
		onlineCalculator.clickOnOnlineCalci();
		onlineCalculator.clickOnOnlineCalculator();
		
		MathsCalculator mathsCalculator=new MathsCalculator(driver);
		mathsCalculator.clickOnTwoDigitAddNumber();
		
		AdditionCalculator additionCalculator=new AdditionCalculator(driver);
		additionCalculator.sendFirstInput("6");
		additionCalculator.sendSecondInput("5");
		additionCalculator.sendThirdInput("3");
		additionCalculator.sendFourthInput("5");
		additionCalculator.clickOnSolveButton();
		

	}

}
