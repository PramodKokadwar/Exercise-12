package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class LoginTest  extends TestBase {

	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;



	public LoginTest() {
		super();
	}


	@BeforeClass
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = new HomePage();

	}

	@Test(priority = 1)
	public void loginwithValidCredentials() throws InterruptedException, IOException {

		// Enter the login Email
		loginPage.enterTheloginEmail("Pramodkokadwar@gmail.com");

		// Enter the login password
		loginPage.enterTheloginPassword("Test@1234");

		// click on robot button
		loginPage.clickOnRobotButton();

		// click on login button
		loginPage.clickOnLoginButton();

		// Verify title of home page after login
		String loginPageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(loginPageTitle, "My Account / Your Overview");

		// perform logout 
		homePage.logOut();

	}

	@Test(priority = 2)
	public void loginwithInValidCredentials() throws InterruptedException, IOException {

		// Enter the login Email
		loginPage.enterTheloginEmail("Pramodkokadwar@gmail.com");

		// Enter the login password
		loginPage.enterTheloginPassword("Test@2");

		// click on robot button
		loginPage.clickOnRobotButton();

		// click on login button
		loginPage.clickOnLoginButton();

		String errorMsg = loginPage.getErrorMessage();
		Assert.assertEquals(errorMsg, "E-mail address and/or password are incorrect. Please check your entries.");


	}

}
