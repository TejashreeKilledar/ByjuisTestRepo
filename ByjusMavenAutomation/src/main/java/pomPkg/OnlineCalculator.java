package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineCalculator {

	
	@FindBy (xpath="//span[text()='Online Calculator']")
	private WebElement onlinecalci;
	
	@FindBy (xpath="//img[@title='Online Math calculator']")
	private WebElement onlinecalculator;
	
	public OnlineCalculator(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnOnlineCalci()
	{
		onlinecalci.click();
		
	}
	
	public void clickOnOnlineCalculator()
	{
		onlinecalculator.click();
	}
}
