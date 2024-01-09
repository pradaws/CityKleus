package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Login_Page;

public class LoginTest extends BaseClass {
	Login_Page loginPage;

	@Test(dataProvider="dp",priority = 0, testName = "TC-0001", description = "Login Functionality check with correct username and password(Existing user, Admin)")
	public void logintest1(String usr , String pwd) throws InterruptedException {
		loginPage = new Login_Page(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		loginPage.login(usr, pwd);

		/*
		 * loginPage = new Login_Page(driver);
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * loginPage.login("rpradeepsrinivasan@yahoo.com", "Demo#1");
		 * 
		 * loginPage.login("rpradeepsrinivasan1992@gmail.com", "Demo#2");
		 */

	}
	
	@DataProvider(name="Dp",indices= {0,1,2})
	String [][] logindata(){

		String data[][]={ 

				{"Admin","admin123"},
				{"prabhu","Kishore1"},
				{"admin","admin123"}


		};
		return data;


}
