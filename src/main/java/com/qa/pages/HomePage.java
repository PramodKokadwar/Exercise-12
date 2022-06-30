package com.qa.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import com.qa.base.TestBase;

public class HomePage extends TestBase{


	// enter the
	@FindBy(id = "loginForm-eMail")
	WebElement loginEmail;


	// click on myAccount
	@FindBy(xpath = "//div[@id='mn-my-account-link']")
	WebElement MyaccountMenu;



	// click on logout link
	@FindBy(xpath = "//a[@id='mn-logout-link']")
	WebElement logOut;


	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}


	public String verifyHomePageTitle(){
		return driver.getTitle();
	}


	// perform Logout
	public void logOut() {

		Actions action = new Actions(driver);
		action.moveToElement(MyaccountMenu).moveToElement(logOut).click().build().perform();
	}




}
