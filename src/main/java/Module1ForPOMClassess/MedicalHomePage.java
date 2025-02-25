package Module1ForPOMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalHomePage {

	@FindBy(xpath="//div[@class='p-element headerlogo']")private WebElement menu;
	@FindBy(xpath="//div[@class='menu-li menu-title2']")private WebElement VoucherEntry;
	@FindBy(xpath="//div[text()=' Counter Sale ']")private WebElement countersale;
	
public MedicalHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void HomePageClickOnMenu()
{
	menu.click();
}
/*public String HomePageClickOnVoucherEntry()
{
	String VoucherEntryText=VoucherEntry.getText();
	System.out.println(VoucherEntryText);
	return VoucherEntryText;
}*/
public void HomePageClickOnCounterSaleOption()
{
	countersale.click();
}
}
