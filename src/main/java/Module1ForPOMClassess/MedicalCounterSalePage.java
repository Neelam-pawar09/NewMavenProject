package Module1ForPOMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalCounterSalePage {
	
	@FindBy(xpath="//input[@class='p-element p-inputtext p-component w-full search-button']")private WebElement inputfield;
	@FindBy(xpath="(//table[@id='pn_id_34-table'])//tr[1]")private WebElement productselect;
	@FindBy(xpath="//input[@name='searchproduct']")private WebElement searchtext;
	public MedicalCounterSalePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void CounterSaleSendDatainInputField() throws InterruptedException
{
     inputfield.sendKeys("ALLEGRA 120");	
     Thread.sleep(2000);
	inputfield.click();
	 Thread.sleep(4000);

	
}
public void CounterSaleClickOnProduct() throws InterruptedException
{
	 Thread.sleep(4000);
	 searchtext.click();
	
}
}
