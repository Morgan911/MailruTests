package com.epam.sikachov.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.epam.sikachov.factory.MyPageFactory;

public class PageAfterMessageSend extends MenuPage{
	
	@FindBy(xpath = "//div/div/div/div[8]/div[2]/div/div[8]/div/div/div/a")
	protected WebElement messageSendedText;
	
	public boolean isOnThisPage(){
		//System.out.println("messageSendedText.isDisplayed(); "+ messageSendedText.isDisplayed());
		return !messagesMenuLink.isEnabled();
	}

	@Override
	public void tryToOpen() {
		MyPageFactory.getPage(driver, WriteMessagePage.class).sendNewMail();
	}
	
	public InboxPage goToInbox(){ 
		return MyPageFactory.getPage(driver, InboxPage.class);
	}

}
