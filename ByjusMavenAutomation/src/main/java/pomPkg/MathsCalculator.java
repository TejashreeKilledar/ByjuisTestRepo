package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MathsCalculator {

	//   //a[text()='2 Digit Number Addition Calculator']
	
	@FindBy (xpath="//a[text()='2 Digit Number Addition Calculator']") 
	private WebElement twoDigitAddNum;
	
	public MathsCalculator(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTwoDigitAddNumber()
	{
		twoDigitAddNum.click();
	}
}
