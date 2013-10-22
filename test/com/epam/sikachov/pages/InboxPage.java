package com.epam.sikachov.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.sikachov.factory.MyPageFactory;

public class InboxPage extends MenuPage {

	@FindBy(xpath = "//span[4]/a/span[2]")
	public WebElement messageLink;

	@Override
	public void tryToOpen() {
		MyPageFactory.getPage(driver, LoginPage.class)
				.login(USERNAME, PASSWORD);
	}
	
}
