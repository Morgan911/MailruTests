package com.epam.sikachov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.epam.sikachov.factory.MyPageFactory;

public class WriteMessagePage extends MenuPage {

	@FindBy(id = "sentmsgab_compose_to")
	public WebElement to;
	@FindBy(id = "sentmsgab_compose_subj")
	public WebElement subject;
	@FindBy(id = "sentmsgcomposeEditor_ifr")
	public WebElement massageBodyFrame;
	@FindBy(id = "tinymce")
	public WebElement messageBody;
	@FindBy(xpath = "//div[2]/div/div[7]/div/form/div[4]/div[2]/a")
	public WebElement send;
	@FindBy(id = "sentmsgcomposeAvatar")
	public WebElement photo;
	
	@Override
	public void tryToOpen() {
		MyPageFactory.getPage(driver, InboxPage.class).writeMessagePageOpen();
	}
	
	public boolean isOnThisPage(){
		return !messagesMenuLink.isEnabled();
	}
	
	public PageAfterMessageSend sendNewMail() {
		// Ввод адреса получателя
		System.out.println("Helllooo");
		to.clear();
		to.sendKeys(USERNAME);
		// Ввод темы письма
		subject.clear();
		subject.sendKeys("My topic");
		// Переход в тело сообщения
		driver.switchTo().frame(
				massageBodyFrame);
		messageBody.click();
		messageBody.sendKeys("Message Body");
		driver.switchTo().defaultContent();
		
		
		// Нажатие на кнопку отправить
		send.click();
		return MyPageFactory.getPage(driver, PageAfterMessageSend.class);
		
		
	}
}
