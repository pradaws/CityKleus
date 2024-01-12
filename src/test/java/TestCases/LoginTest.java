package TestCases;

import org.testng.annotations.Test;

import PageObject.Login_Page;

//This class is to test existing users. 
public class LoginTest extends BaseClass {

	// Existing Users credentials
	String adminUserName = "admin@klues.ai";
	String adminPassword = "Demo$123";
	String employeeUserName = "pradeep@gmail.com";
	String employeePassword = "Pradeep@1234";
	String supervisorUserName = "supervisor@gamil.com";
	String supervisorPassword = "Supervisor@123";
	String reviewerUserName = "reviewer@gmail.com";
	String reviewerPassword = "Reviewer@123";

	// Admin user Login Test
	@Test(priority = 0, description = "Login Functionality check with correct username and password(Existing user, Admin)")
	public void adminUserLoginTest() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(adminUserName, adminPassword);
	}
	
	// Employeel ogin Test
	@Test(priority  = 1, enabled = true, testName = "Login Functionality for Employee user.", description = "Login Functionality check with correct username and password(Existing user, Employee)")
	public void employeeUserLoginTest() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(employeeUserName, employeePassword);
	}

	@Test(priority = 2, testName = "TC0003", description = "Login Functionality check with correct username and password(Existing user, Supervisor)")
	public void supervisorUserLoginTest() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(supervisorUserName, supervisorPassword);
	}

	@Test(priority = 3, testName = "TC0004", description = "Login Functionality check with correct username and password(Existing user, Supervisor)")
	public void reviewerUserLoginTest() throws InterruptedException {
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login(reviewerUserName, reviewerPassword);
	}
}