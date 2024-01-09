package TestCases;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	//public ResourceBundle rb;
	
	
	@BeforeClass
	public void openApplication() 
	{
		 driver =new ChromeDriver();
		 
	//	 rb=ResourceBundle.getBundle("./config.properties");
		 driver.get("https://ck-staging-web.klues.ai/login");
		 
		 
		 
	}
	
	@AfterClass
	public void closeApplication()
	{
		
		//driver.close();
	}

}
