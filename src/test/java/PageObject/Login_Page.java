package PageObject;

import static org.testng.Assert.assertFalse;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class Login_Page {

	public WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='v-text-field__slot'] //input[@autofocus='autofocus']")
	WebElement userNameField;

	@FindBy(xpath = "//div[@class='v-text-field__slot'] //input[@type='password']")
	WebElement passwordField;

	@FindBy(xpath = "//span[@class='text-capitalize medium-inter-family']")
	WebElement loginButton;
	
	@FindBy(xpath ="//div[@role='status']")
	WebElement statusOfLoginToast;

	public void login(String username, String passwordtxt) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfAllElements(userNameField));
		userNameField.click();
		userNameField.sendKeys(username);
		wait.until(ExpectedConditions.visibilityOfAllElements(passwordField));
		passwordField.click();
		passwordField.sendKeys(passwordtxt);
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(statusOfLoginToast));
		String valueOfToast = statusOfLoginToast.getText();
		System.out.println(valueOfToast);
	}
	
	public void inactiveUserLogin() {
		
		
		
	}

}
