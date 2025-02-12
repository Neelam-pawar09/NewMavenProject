package LibraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	public static String PropertyFileTD(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\NewMavenProject\\ProertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		String value=p.getProperty(key);
		return value;
	}
	public static String TestData(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	 
	
	
	}
	public static void SSCapture(WebDriver driver,int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\NewMavenProject\\ScreenShot\\Sample1"+TCID+".jpg");
		FileHandler.copy(src, dest);
		
	}

}
