package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Page {

	public WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-19")
	WebElement userName;

	@FindBy(id = "input-20")
	WebElement password;

	@FindBy(xpath = "//span[@class='text-capitalize medium-inter-family']")
	WebElement loginButton;

	// @FindBy(className="px-6 v-btn v-btn--is-elevated v-btn--has-bg theme--light
	// v-size--default success darken-1")
	// WebElement btnlogin;

	@Test(dataProvider = "dp")
	public void login(String username, String passwordtxt) {
		userName.click();
		userName.sendKeys(username);
		password.click();
		password.sendKeys(passwordtxt);
		loginButton.click();
	}

}
