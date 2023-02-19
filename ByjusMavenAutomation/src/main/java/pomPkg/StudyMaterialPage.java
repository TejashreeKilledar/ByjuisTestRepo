package pomPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudyMaterialPage {

	@FindBy (xpath="(//a[@class='dropdown-toggle'])[1]") 
	private WebElement studyMaterial;
	
	@FindBy (xpath="(//a[text()='Calculators'])[1]")
	private WebElement calculator;
	
	public StudyMaterialPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnStudyMaterial() throws InterruptedException
	{
		Thread.sleep(5000);
		studyMaterial.click();
	}
	
	public void clickOnCalculatorButton() throws InterruptedException
	{
		Thread.sleep(5000);
		calculator.click();
	}
	
	
}
