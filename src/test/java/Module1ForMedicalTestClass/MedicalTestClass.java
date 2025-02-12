package Module1ForMedicalTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import LibraryFile.BaseClass;
import LibraryFile.UtilityClass;
import Module1ForPOMClassess.MedicalLoginPage;

public class MedicalTestClass extends BaseClass{
	
	
	MedicalLoginPage login;
	int TCID;
@BeforeClass	
public void OpenBrowser() throws IOException
{   initializeBrowser();
	login=new MedicalLoginPage(driver);
	
}

@BeforeMethod
public void LoginToApp() throws IOException, InterruptedException 
{
	login.InputMedicalUN(UtilityClass.PropertyFileTD("UN"));
	Thread.sleep(2000);
	
	login.InputMedicalPWS(UtilityClass.PropertyFileTD("PWD"));
	Thread.sleep(2000);
	login.ClickMedicalLogin();

}


@Test
public void verifyTC() throws EncryptedDocumentException, IOException
{
	TCID=101;
	SoftAssert soft=new SoftAssert();
	String AR=login.verifyTest();
	System.out.println(AR);
	String ER=UtilityClass.TestData(1, 0);
	System.out.println(ER);
	soft.assertEquals(AR, ER,"Failed");
	soft.assertAll();
	
}
@AfterMethod
public void CloseToApp(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		UtilityClass.SSCapture(driver, TCID);
	}
}

@AfterClass
public void CloseBrowser()
{
driver.close();
}

}
