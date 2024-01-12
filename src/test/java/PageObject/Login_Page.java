package PageObject;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Login_Page {

	public WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-19")
	WebElement userNameField;

	@FindBy(id = "input-20")
	WebElement passwordField;

	@FindBy(xpath = "//span[@class='text-capitalize medium-inter-family']")
	WebElement loginButton;

	public void login(String username, String passwordtxt) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfAllElements(userNameField));
		userNameField.click();
		userNameField.sendKeys(username);
		wait.until(ExpectedConditions.visibilityOfAllElements(passwordField));
		passwordField.click();
		passwordField.sendKeys(passwordtxt);
		wait.until(ExpectedConditions.visibilityOfAllElements(loginButton));
		loginButton.click();
	}

}
