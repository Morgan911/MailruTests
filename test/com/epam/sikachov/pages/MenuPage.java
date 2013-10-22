package com.epam.sikachov.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.sikachov.factory.MyPageFactory;

public class MenuPage extends AnyPage {

	@FindBy(id = "HeaderBtnSentMsg")
	public WebElement writeMenuLink;
	@FindBy(id = "HeaderBtnCheckNewMsg")
	public WebElement messagesMenuLink;
	@FindBy(xpath = "//div/div[8]/div/div/div/div/div/div/a/span[2]")
	public WebElement inboxButton;
	@FindBy(id = "PH_logoutLink")
	public WebElement logOutLink;
	protected static final String USERNAME = "john_black9116@mail.ru";
	protected static final String PASSWORD = "John630646";

	public boolean isOnThisPage() {
		return logOutLink.isDisplayed();
	}

	public void logout() {
		System.out.println("in logout");
		logOutLink.click();
	}

	public void writeMessagePageOpen() {

		writeMenuLink.click();
	
	}
	
	public WriteMessagePage write(){
		System.out.println("good");
		return MyPageFactory.getPage(driver, WriteMessagePage.class);
	}


	@Override
	public void tryToOpen() {
		// TODO Auto-generated method stub

	}
}
