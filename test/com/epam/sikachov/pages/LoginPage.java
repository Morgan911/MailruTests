package com.epam.sikachov.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.sikachov.factory.MyPageFactory;

public class LoginPage extends AnyPage{
	

	@FindBy(id = "mailbox__login")
	public WebElement userNameField;
	@FindBy(id = "mailbox__password")
	public WebElement passwordField;
	@FindBy(id = "mailbox__login__domain")
	public WebElement domainName;
	@FindBy(id = "mailbox__auth__button")
	public WebElement loginBtn;
	@FindBy(id = "PH_authLink")
	public WebElement enterButton;

	
	public boolean isOnThisPage(){
		return enterButton.isDisplayed();
	}

	public void login(String user, String pass) {
		userNameField.clear();
		userNameField.sendKeys(user);
		passwordField.clear();
		passwordField.sendKeys(pass);
		loginBtn.click();
		System.out.println("Log");
	}
	@Override
	public void tryToOpen() {
		System.out.println("Tru In Login");
		MyPageFactory.getPage(driver, InboxPage.class).logout();

	}
	
	
	
	
	

}
