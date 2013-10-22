package com.epam.sikachov.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	public WebDriver driver;
	
	public boolean isOnThisPage(){
		return true;
	}
	
	public abstract void tryToOpen();
	
	public WebDriverWait wait_(){
		return new WebDriverWait(driver, 10);
	}

}
