package LibraryFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public WebDriver driver;
	public void initializeBrowser() throws IOException
	{
	 driver=new ChromeDriver();
	 driver.get(UtilityClass.PropertyFileTD("URL"));
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	
	 
	}

}
