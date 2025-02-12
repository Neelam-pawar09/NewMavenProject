package Module1ForPOMClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalLoginPage {
@FindBy(xpath="//input[@name='UserName']")private WebElement UN;
@FindBy(xpath="//input[@name='Password']")private WebElement PWD;
@FindBy(xpath="(//button[@class='login-btn'])[1]")private WebElement login;
@FindBy(xpath="(//div[@class='headname'])[1]")private WebElement text;

public MedicalLoginPage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void InputMedicalUN(String UserName)
{
	UN.sendKeys(UserName);
}
public void InputMedicalPWS(String Password)
{
	PWD.sendKeys(Password);
}
public void ClickMedicalLogin()
{
	login.click();
}
public String verifyTest()
{
	String textvalue=text.getText();
	System.out.println(textvalue);
	return textvalue;
}

}
