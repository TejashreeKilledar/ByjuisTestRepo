package pomPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionCalculator {
	
	@FindBy (xpath="//input[@id='a']")
	private WebElement firstInput;
	
	@FindBy (xpath="//input[@id='b']")
	private WebElement secondInput;
	
	@FindBy (xpath="//input[@id='c']")
	private WebElement thirdInput;
	
	@FindBy (xpath="//input[@id='d']")
	private WebElement fourthInput;
	
	@FindBy (xpath="//input[@class='clcbtn']")
	private WebElement solveButton;
	
	public AdditionCalculator(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendFirstInput(String a)
	{
		firstInput.sendKeys(a);
	}

	public void sendSecondInput(String b)
	{
		secondInput.sendKeys(b);
	}
	public void sendThirdInput(String c)
	{
		thirdInput.sendKeys(c);
	}
	public void sendFourthInput(String d)
	{
		fourthInput.sendKeys(d);
	}
	public void clickOnSolveButton()
	{
		solveButton.click();
	}
}
