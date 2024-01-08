package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Login_Page;

public class LoginTest {
	Login_Page loginPage;
	@BeforeTest
	public void browserConfiguration() {
		
//		WebDriver driver;
//		String loginPageURL="google.co.in";
//		driver = new ChromeDriver();
//		System.out.println("lahir");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get(loginPageURL);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
	}
	@Test
	public void testThePage() {
		WebDriver driver;
		String loginPageURL="https://google.com";
		driver = new ChromeDriver();
		System.out.println("lahir");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(loginPageURL);
		driver.manage().window().maximize();
		System.out.println("kdbv");
		
	}

}
