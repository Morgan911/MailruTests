package com.epam.sikachov.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class SendMessageTest extends BaseTest{
	protected static final String USERNAME = "john_black9116@mail.ru";

	// @Ignore
	@Test
	public void testSendMail() {
		goToMainPage();
		//MyPageFactory.getPage(driver, InboxPage.class).write();
		sendMail();
		//verifyMessageDelivery();
	}
 
	private void verifyMessageDelivery() {
		//  лик на кнопку "¬ход€щие"
		pageAfterSend.inboxButton.click();
		//  лик на письмо
		inboxPage.messageLink.click();
		//∆дем пока откроем письмо
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/div/div/h1")));
	}

	

	
}
