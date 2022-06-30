package com.qa.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	// enter the email
	@FindBy(id = "loginForm-eMail")
	WebElement loginEmail;

	// enter the password
	@FindBy(name = "password")
	WebElement loginPassword;

	// click on login Button
	@FindBy(id = "login-submit-btn")
	WebElement loginBtn;

	// click on forgot password link
	@FindBy(xpath = "//font[contains(text(),'Forgot Password?')]")
	WebElement forgotPasswordLink;

	// error email or password is wrong
	@FindBy(xpath = "/aside[@class='m-Notification m-Notification--error l-flex u-padding--sides']")
	WebElement errorWorngCredentials;

	// click on the auto robot button
	@FindBy(xpath = "//button[@class='frc-button']")
	WebElement robotButton;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Enter the email address 
	public void enterTheloginEmail(String email)
	{
		loginEmail.sendKeys(email);
	}

	// Enter the email password 
	public void enterTheloginPassword(String password)
	{
		loginPassword.sendKeys(password);
	}

	// Click on login Button 
	public void clickOnLoginButton()
	{
		loginBtn.click();
	}

	// click on forgot password
	public void forgotPassword()
	{
		forgotPasswordLink.click();
	}

	// Get Credentials error
	public String getErrorMessage()
	{
		return errorWorngCredentials.getText();
	}
	
	// click on robot button
	public void clickOnRobotButton()
	{
		robotButton.click();
	}
}
