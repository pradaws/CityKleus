package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	public  WebDriver driver;
	
      public Login_Page(WebDriver driver) {
		this.driver = driver;
	}
      
      public void hello() {
    	  
    	  driver.get("google.com");
    	  
      }
      
      public void close() {
    	  
    	  driver.close();
    	  
      }
	
	WebElement user=driver.findElement(By.id("input-19"));
	
	WebElement password= driver.findElement(By.id("input-20"));
	
	WebElement btnlogin= driver.findElement(By.xpath("//button[@type='button']"));
	
	
	
	

	
}
