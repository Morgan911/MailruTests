package com.epam.sikachov.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.sikachov.factory.MyPageFactory;
import com.epam.sikachov.factory.WebDriverFactory;
import com.epam.sikachov.pages.InboxPage;
import com.epam.sikachov.pages.LoginPage;
import com.epam.sikachov.pages.PageAfterMessageSend;
import com.epam.sikachov.pages.WriteMessagePage;

public class BaseTest {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected LoginPage loginPage;
	protected WriteMessagePage writeMessagePage;
	protected InboxPage inboxPage;
	protected PageAfterMessageSend pageAfterSend;
	protected static final String ADDRESS = "http://mail.ru/";
	
	
	@Before
	public void setUp() {
		driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
		//driver.manage().window().maximize();
		//wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(ADDRESS);
		
	}
	
	protected InboxPage goToMainPage(){
		return MyPageFactory.getPage(driver, InboxPage.class);
	}
	
	protected LoginPage goToLoginPage(){
		System.out.println("GoToLoginPage");
		return MyPageFactory.getPage(driver, LoginPage.class);
	}
	
	
	protected PageAfterMessageSend sendMail(){
		return MyPageFactory.getPage(driver, PageAfterMessageSend.class);
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
